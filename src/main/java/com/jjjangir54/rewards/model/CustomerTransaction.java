package com.jjjangir54.rewards.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "CUSTOMER_TRANSACTION")
public class CustomerTransaction {
	
	@Id
	@Column(name = "ID")
	private Long id;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
	private Customer customer;

	@Column(name = "TRANSACTION_AMOUNT")
	Double transactionAmount;
	
	@Column(name = "TRANSACTION_DATE")
	LocalDate transactionDate;

}
