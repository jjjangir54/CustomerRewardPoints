package com.jjjangir54.rewards.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "CUSTOMER")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<CustomerTransaction> customerTransaction;
	
	@Transient
	double firstMonthRewards;
	
	@Transient
	double secondMonthRewards;
	
	@Transient
	double thirdMonthRewards;
	
	@Transient
	double totalRewardAmount;
	
	public double getFirstMonthRewards() {
        return BigDecimal.valueOf(firstMonthRewards).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
	
	public double getSecondMonthRewards() {
        return BigDecimal.valueOf(secondMonthRewards).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
	
	public double getThirdMonthRewards() {
        return BigDecimal.valueOf(thirdMonthRewards).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
	
	public double getTotalRewardAmount() {
		return firstMonthRewards + secondMonthRewards + thirdMonthRewards;
	}
}
