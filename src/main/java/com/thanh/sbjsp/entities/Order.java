package com.thanh.sbjsp.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.Data;

@Data
@Entity // Đánh dấu đây là table trong db
@Table(name = "Orders")
public class Order implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id //Đánh dấu là primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Giúp tự động tăng
	Long id;
	String address;
	@Temporal(TemporalType.DATE)
	@Column(name = "Createdate")
	Date createDate = new Date();
	@ManyToOne // Many to One có nhiều Order ở 1 Account
	@JoinColumn(name = "Username") // thông qua khóa ngoại Username
	Account account;
	@OneToMany(mappedBy = "order") // Quan hệ 1-n với đối tượng ở dưới (OrderDetail) (1 Order có nhiều OrderDetail)
	List<OrderDetail> orderDetails;

}
