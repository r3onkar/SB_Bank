package com.banking.Dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import lombok.Data;

@Data
@Component
public class AccountDto {

	private Long id;

	private String accountHolderName;
	
	private double balance;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountDto map(AccountDto accountDto) {
		// TODO Auto-generated method stub
		return accountDto;
	}
}
