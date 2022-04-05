package com.Itexpress.Itexpress.repository;

import org.springframework.stereotype.Repository;

import com.Itexpress.Itexpress.model.Account;
import com.Itexpress.Itexpress.controller.AccountController;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	
	Optional<Account> findByRegisterId(String registerId);
}

