package com.poly.sbjsp.controller;



import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.poly.sbjsp.model.Product;

@Controller
public class ProductController2 {

	@GetMapping("/product/form2")
	public String form(Model model) {
		Product p = new Product();
		p.setName("iphone 13");
		p.setPrice(5000.0);
		model.addAttribute("product1", p);
		return "lab2/product/form2";		
	}
	@PostMapping("product/save2")
	public String save(@ModelAttribute("product2") Product p) {
		
		return "lab2/product/form2";
	}

	@ModelAttribute("items")
	public List<Product> getItems() {
		return Arrays.asList(new Product("SamSung", 15.0), new Product("IPhone", 12.0),new Product("XiaoMi",1500.0));
	}
}
