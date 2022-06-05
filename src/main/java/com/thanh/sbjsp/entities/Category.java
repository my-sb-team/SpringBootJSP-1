package com.thanh.sbjsp.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity // Đánh dấu đây là table trong db
@Table(name = "Categories")

public class Category implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id //Đánh dấu là primary key
	String id;
	String name;
	@OneToMany(mappedBy = "category") // Quan hệ 1-n với đối tượng ở dưới (Product) (1 Category có nhiều Product)
	List<Product> products;
}
