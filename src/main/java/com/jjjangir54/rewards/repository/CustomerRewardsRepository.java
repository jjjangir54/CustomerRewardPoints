package com.jjjangir54.rewards.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jjjangir54.rewards.model.Customer;
import com.jjjangir54.rewards.model.CustomerTransaction;

@Repository
public interface CustomerRewardsRepository extends JpaRepository<Customer, Integer>{
	
	public Set<CustomerTransaction> findAllById(Integer customerId);
}
