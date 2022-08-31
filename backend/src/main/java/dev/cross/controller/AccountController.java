package dev.cross.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.cross.model.Account;
import dev.cross.model.BasicInfo;
import dev.cross.model.Login;
import dev.cross.service.AccountService;

@CrossOrigin
@RestController
public class AccountController {
	
	private final AccountService accountService;
	
	@Autowired
	public AccountController (AccountService accountService) {
		this.accountService = accountService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<Integer> login(@RequestBody Login creds) {
		int value = accountService.login(creds);
		
		if (value == -1) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(-1); 
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(value);
		}
	}
	
	@RequestMapping(value = "/createAccount", method = RequestMethod.POST)
	public ResponseEntity<Integer> createAccount(@RequestBody Account info) {
		int value = accountService.createAccount(info);
		
		if (value == -1) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(-1); 
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(value);
		}
	}
	
	@RequestMapping(value = "/updateBasic", method = RequestMethod.PATCH)
	public void updateBasicInfo(@RequestBody BasicInfo info) {
		accountService.updateBasicAccountInfo(info);
	}
	
	
}
