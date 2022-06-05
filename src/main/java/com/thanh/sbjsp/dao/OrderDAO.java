package com.thanh.sbjsp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thanh.sbjsp.entities.Order;

public interface OrderDAO extends JpaRepository<Order, Long>{

}
