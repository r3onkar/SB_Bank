package com.banking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.banking.service.AccountService;
import com.banking.serviceImple.AccountServiceImpl;

@Configuration
public class AppConfig {


	    @Bean
	    public AccountService accountService() {
	        return new AccountServiceImpl(null);
	    }
	

}
