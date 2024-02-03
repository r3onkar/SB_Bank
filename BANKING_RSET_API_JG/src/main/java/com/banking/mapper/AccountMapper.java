package com.banking.mapper;

import com.banking.Dto.AccountDto;
import com.banking.entity.Account;

public class AccountMapper {

	 
	
	public static Account maptoAccount(AccountDto accountDto) {
		
		Account account = new Account();
		accountDto.getId();
		accountDto.getAccountHolderName();
		accountDto.getBalance();
		return account;
	}
	
public static AccountDto maptoAccountDto(Account account ) {
		
		AccountDto accountDto = new AccountDto();
		accountDto.getId();
		accountDto.getAccountHolderName();
		accountDto.getBalance();
		return accountDto;
	}
	

}
