package com.banking.serviceImple;

import com.banking.Dto.AccountDto;
import com.banking.entity.Account;
import com.banking.mapper.AccountMapper;
import com.banking.repository.AccountRepository;
import com.banking.service.AccountService;

public class AccountServiceImpl  implements AccountService {

  private final AccountRepository accountRepository; 
	
  //constuctor base injection
	public AccountServiceImpl(AccountRepository accountRepository){
	this.accountRepository =accountRepository;
	}

	@Override
	public AccountDto accountCreated(AccountDto accountDto) {

		Account account = AccountMapper.maptoAccount(accountDto);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.maptoAccountDto(savedAccount);
	}

	@Override
	public AccountDto getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDto getAccountById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDto saveAccount(AccountDto account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount(long id) {
		// TODO Auto-generated method stub
		
	}



}
