package com.poly.sbjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class OkController {
	@RequestMapping("/ok")
	public String ok() {
		return "lab2/ok";
	}
	@RequestMapping("/ctrl/ok")
	public String m1(Model model) {
		model.addAttribute("ketqua", "OK 1");
		return "lab2/ok";
	}
	@GetMapping("/ctrl/ok")
	public String m2(Model model) {
		model.addAttribute("ketqua", "OK 2");
		return "lab2/ok";
	}
	@RequestMapping("/ctrl/ok3")
	public String m3(Model model) {
		model.addAttribute("ketqua", "OK 3");
		return "lab2/ok";
	}

}
