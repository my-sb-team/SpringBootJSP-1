package com.thanh.sbjsp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thanh.sbjsp.entities.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long>{

}
