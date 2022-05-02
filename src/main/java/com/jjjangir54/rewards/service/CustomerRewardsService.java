package com.jjjangir54.rewards.service;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jjjangir54.rewards.model.Customer;
import com.jjjangir54.rewards.model.CustomerTransaction;
import com.jjjangir54.rewards.repository.CustomerRewardsRepository;
import com.jjjangir54.rewards.utility.RewardsUtility;

@Service
public class CustomerRewardsService {
	
	Logger logger = LoggerFactory.getLogger(CustomerRewardsService.class);
	
	@Autowired
	CustomerRewardsRepository customerRewardRepo;
	
	public List<Customer> calculateRewardsForAll() {
		logger.info("calculateRewardsForAll method In CustomerRewardsService start....");

		List<Customer> customerList = customerRewardRepo.findAll();
		if (customerList != null) {
			for (Customer customer : customerList) {
				logger.debug("Calculating rewards for Each Customer:::::"
						+ customer.getName());
				List<CustomerTransaction> listOfTransaction = customer.getCustomerTransaction();
				setRewardsPerMonth(listOfTransaction, customer);
				logger.debug("End of reward calculation for customer" + customer.getName());
			}

		}

		logger.info("calculateRewardsForAll method in CustomerRewardsService ends....");
		return customerList;
	}

	public Customer calculateRewardsById(Integer customerId) {
		logger.info("calculateRewardsbyId method In CustomerRewardsService start....");
		
		Customer customerReward = customerRewardRepo.findById(customerId).orElse(null);
		
		if(customerReward != null) {
			logger.debug("Calculating rewards for requested Customer :: " + customerReward.getName());
			
			List<CustomerTransaction> listOfTransaction = customerReward.getCustomerTransaction();
			setRewardsPerMonth(listOfTransaction, customerReward);
			
			logger.info("End of reward calculation for customer :: " + customerReward.getName());
		}
		
		logger.debug("calculateRewardsbyId method In CustomerRewardsService end....");
		return customerReward;
	}
	
	private void setRewardsPerMonth(List<CustomerTransaction> listOfTransaction, Customer customer) {	
		LocalDate todayDate = LocalDate.now();
		for (CustomerTransaction transaction : listOfTransaction) {
			
			int transactionMon = transaction.getTransactionDate().getMonthValue();
			int transactionYear = transaction.getTransactionDate().getYear();
			
			logger.info("Start Calculating Rewards for Customer:::" + customer.getName() + " for Transaction Id::: "
					+ transaction.getId());

			if ((todayDate.getYear() == transactionYear) 
					&& (todayDate.getMonth().getValue() == transactionMon)) {
				customer.setThirdMonthRewards(customer.getThirdMonthRewards()
						+ RewardsUtility.calculateRewardAmountPerTrans(transaction.getTransactionAmount()));
			}
			else if ((todayDate.minusMonths(1).getYear() == transactionYear)
					&& (todayDate.minusMonths(1).getMonth().getValue() == transactionMon)) {
				customer.setSecondMonthRewards(customer.getSecondMonthRewards()
						+ RewardsUtility.calculateRewardAmountPerTrans(transaction.getTransactionAmount()));
			}
			else if ((todayDate.minusMonths(2).getYear() == transactionYear)
					&& (todayDate.minusMonths(2).getMonth().getValue() == transactionMon)) {
				customer.setFirstMonthRewards(customer.getFirstMonthRewards()
						+ RewardsUtility.calculateRewardAmountPerTrans(transaction.getTransactionAmount()));
			}
			logger.info("End Calculating Rewards for customer::::" + customer.getName() + " for Transaction Id:::"
					+ transaction.getId());
		}
	}
}
