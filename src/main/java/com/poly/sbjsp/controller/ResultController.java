package com.poly.sbjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ResultController {
	
	@RequestMapping("/a")
	public String m1() {
		return "lab2/a";
	}
	@RequestMapping("/b")
	public String m2(Model model) {
		model.addAttribute("message", "I come from b");
		return "forward:/a";
	}
	@RequestMapping("/c")
	public String m3(RedirectAttributes params) {
		params.addAttribute("message", "I come from c");
		return "redirect:/a";
	}
	@ResponseBody
	@RequestMapping("/d")
	public String m4() {
		return "<h1>I come from d</h1>";
	}
	
}
