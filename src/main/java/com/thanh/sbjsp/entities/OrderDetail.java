package com.thanh.sbjsp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity // Đánh dấu đây là table trong db
@Table(name = "Orderdetails")
public class OrderDetail implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id //Đánh dấu là primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Giúp tự động tăng
	Long id;
	Double price;
	Integer quantity;
	@ManyToOne // Many to One có nhiều OrderDetail ở 1 Product
	@JoinColumn(name = "Productid")
	Product product;
	@ManyToOne // Many to One có nhiều OrderDetail ở 1 Order
	@JoinColumn(name = "Orderid") // thông qua khóa ngoại Orderid
	Order order;
}
