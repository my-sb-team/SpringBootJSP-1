package com.poly.sbjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PhepTinhController {
	
	@GetMapping("/pheptinh/form")
	public String doGetForm() {
		return "lab2/form2";
	}
	
	@GetMapping("/pheptinh")
	public String doGetResult(@RequestParam("pheptinh") String dau, @RequestParam("a") double a, @RequestParam("b") double b, Model model) {
		double kq = 0;
		try {
			if(dau.equals("+"))
				kq = a + b;
			else if(dau.equals("-"))
				kq = a - b;
			else if(dau.equals("x"))
				kq = a * b;
			else if(dau.equals("/")) {
				if(b == 0) {
					model.addAttribute("err", "ERROR");
					return "lab2/form2";
				}
				else
					kq = a/b;
			}
				
		}catch(Exception e) {
			model.addAttribute("err", "ERROR");
			return "lab2/form2";
		}
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		model.addAttribute("pheptinh", dau);
		model.addAttribute("ketqua", kq);
		return "lab2/form2";
	}

}
