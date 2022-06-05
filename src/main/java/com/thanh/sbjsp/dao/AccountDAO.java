package com.thanh.sbjsp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thanh.sbjsp.entities.Account;


public interface AccountDAO extends JpaRepository<Account, String>{

}
