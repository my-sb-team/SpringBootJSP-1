package com.thanh.sbjsp.controller.lab5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thanh.sbjsp.dao.OrderDAO;
import com.thanh.sbjsp.entities.Order;


@Controller
public class OrderController {

	@Autowired
	OrderDAO dao;
	
	
	@RequestMapping("/order/index")
	public String index(Model model) {
		Order item = new Order();
		model.addAttribute("item", item);
		List<Order> items = dao.findAll();
		model.addAttribute("items", items);
		return "order/index";
	}	
	@RequestMapping("/order/edit/{id}")
	public String edit(Model model, @PathVariable("id") Long id) {
		Order item = dao.findById(id).get();
		model.addAttribute("item", item);
		List<Order> items = dao.findAll();
		model.addAttribute("items", items);
		return "order/index";
	}
	@RequestMapping("/order/create")
	public String create(Order item) {
	dao.save(item);
	return "redirect:/order/index";
	}
	@RequestMapping("/order/update")
	public String update(Order item) {
	dao.save(item);
	return "redirect:/order/edit/" + item.getId();
	}
	@RequestMapping("/order/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
	dao.deleteById(id);
	return "redirect:/category/index";
	}

}
