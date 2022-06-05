package com.thanh.sbjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SanPhamController {
	@GetMapping("/sanpham")
	public String doGetListSanPham() {
		return "lab2/listsanpham";
	}

	@GetMapping("/sanpham/{tensanpham}")
	public String doGetTenSp(@PathVariable("tensanpham") String tenSp, Model model) {
		model.addAttribute("sanpham", tenSp);
		return "lab2/listsanpham";
	}
}
