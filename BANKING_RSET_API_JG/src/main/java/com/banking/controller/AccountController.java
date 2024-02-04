package com.banking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.Dto.AccountDto;
import com.banking.repository.AccountRepository;
import com.banking.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/account")
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private AccountService accountService;

	@Autowired
	private AccountDto accountDto;

	@Autowired


	// Add account rest api

	@PostMapping("/add")
	public ResponseEntity<AccountDto>addAccount( AccountDto accountDto ) {
		return new ResponseEntity<>(accountService.accountCreated(accountDto),HttpStatus.CREATED);
	}

	public AccountController(AccountRepository accountRepository, AccountService accountService) {
		super();
		this.accountRepository = accountRepository;
		this.accountService = accountService;
	}


}
