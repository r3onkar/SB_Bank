package com.banking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.Dto.AccountDto;
import com.banking.repository.AccountRepository;
import com.banking.service.AccountService;
import org.slf4j.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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


	private static Logger logger = LoggerFactory.getLogger(AccountController.class);
	

	// Add account rest api

	@PostMapping("/add")
	public ResponseEntity<AccountDto>addAccount( AccountDto accountDto ) {
		logger.debug("Adding-Account");
		return new ResponseEntity<>(accountService.accountCreated(accountDto),HttpStatus.CREATED);
	}

	
	public AccountController(AccountRepository accountRepository, AccountService accountService) {
		super();
		this.accountRepository = accountRepository;
		this.accountService = accountService;
	}
	
	

    @GetMapping
    public ResponseEntity<AccountDto> getAllAccounts() {
        return ResponseEntity.ok(accountService.getAllAccounts());
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<AccountDto> getAccountById(@PathVariable long id) {
//        return accountService.getAccountById(id)
//            .map(entity -> ResponseEntity.ok(entity))
//            .orElse(ResponseEntity.notFound().build());
//    }

    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@RequestBody AccountDto accountDto) {
        return ResponseEntity.ok(accountService.saveAccount(accountDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AccountDto> updateAccount(@PathVariable long id, @RequestBody AccountDto accountDto) {
        return ResponseEntity.ok(accountService.saveAccount(accountDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable long id) {
        accountService.deleteAccount(id);
        return ResponseEntity.noContent().build();
    }


}
