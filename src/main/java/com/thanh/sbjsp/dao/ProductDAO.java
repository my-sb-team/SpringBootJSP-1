package com.thanh.sbjsp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thanh.sbjsp.entities.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>{
	
}
