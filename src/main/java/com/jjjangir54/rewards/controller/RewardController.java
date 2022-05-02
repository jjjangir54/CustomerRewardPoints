package com.jjjangir54.rewards.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jjjangir54.rewards.exceptions.ExceptionHandlerController.CustomerNotFoundException;
import com.jjjangir54.rewards.model.Customer;
import com.jjjangir54.rewards.service.CustomerRewardsService;

@RestController
@RequestMapping("/customer")
public class RewardController {

	Logger logger = LoggerFactory.getLogger(RewardController.class);

	@Autowired
	private CustomerRewardsService customerRewardsService;

	@GetMapping(value = "/all")
	public ResponseEntity<Object> getCustomerRewards() {
		logger.info("In RewardsController::getCustomerRewards method start");
		List<Customer> customerList = customerRewardsService.calculateRewardsForAll();
		if (customerList.isEmpty() || customerList.size() == 0) {
			logger.error("In RewardsController::getCustomerRewards Customer List is empty");
			throw new CustomerNotFoundException("Customers not available");
		}
		return new ResponseEntity<>(customerList, HttpStatus.OK);
	}

	@GetMapping(value = "/rewards/{customerId}")
	public ResponseEntity<Customer> getCustomerRewardById(@PathVariable("customerId") String customerId)
			throws Exception {
		logger.info("In RewardsController::getCustomerRewardById method start");
		Customer customerRewardsSummary = null;
		try {
			customerRewardsSummary = customerRewardsService.calculateRewardsById(Integer.parseInt(customerId.trim()));
			if (customerRewardsSummary == null) {
				logger.error(
					"In RewardsController::getCustomerRewardById Customer Object is Empty or No Customer Record Found");
				throw new CustomerNotFoundException("Customer with Id :: " + customerId + " does not exist");
			}
		} catch (NumberFormatException e) {
			throw new CustomerNotFoundException("Invalid Customer ID. Please Enter a valid Customer ID");
		} catch (CustomerNotFoundException e) {
			throw new CustomerNotFoundException("Customer with Id :: " + customerId + " does not exist");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Customer>(customerRewardsSummary, HttpStatus.OK);
	}
}