package com.thanh.sbjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/index.php")
	public String index(Model model) {
		String message = "Welcome to Spring MVC";
		model.addAttribute("message", message);
		return "index";
	}

}
