package com.banking.service;

import org.springframework.stereotype.Service;

import com.banking.Dto.AccountDto;

@Service
public interface AccountService {

	

	AccountDto accountCreated(AccountDto accountDto);

}
