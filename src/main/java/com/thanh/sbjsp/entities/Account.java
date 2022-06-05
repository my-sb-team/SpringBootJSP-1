package com.thanh.sbjsp.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Accounts")

public class Account implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id //Đánh dấu là primary key
	String username;
	String password;
	String fullname;
	String email;
	String photo;
	boolean activated;
	boolean admin;
	@OneToMany(mappedBy = "account") // Quan hệ 1-n với đối tượng ở dưới (Order) (1 Account có nhiều Order)
	List<Order> orders;
}
