package com.Itexpress.Itexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Itexpress.Itexpress.model.Account;
import com.Itexpress.Itexpress.repository.AccountRepository;
import io.swagger.annotations.ApiOperation;

@Controller
public class AccountController {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@ApiOperation(value = "List All Accounts")
    @GetMapping("/all")
    public List<Account> GetAccount() {
    	return accountRepository.findAll();
    }
	@GetMapping("/account/{id}")
	public Account listaAccountUnico(@PathVariable(value="id")Integer id){
		return AccountRepository.findById(id);
	}

	@PostMapping("/account")
public Account salvarAccount(@RequestBody Account account){
		return AccountRepository.save(account);
	}
	@DeleteMapping("/account")
	public void deletaAccount(@RequestBody Account account){
	}

	


}
