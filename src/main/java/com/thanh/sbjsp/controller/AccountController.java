package com.thanh.sbjsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.thanh.sbjsp.service.CookieService;
import com.thanh.sbjsp.service.ParamService;
import com.thanh.sbjsp.service.SessionService;

@Controller
public class AccountController {
	@Autowired
	CookieService cookieService;
	@Autowired
	ParamService paramService;
	@Autowired
	SessionService sessionService;

	@GetMapping("/account/login")
	public String login1() {
		return "account/login";
	}

	@PostMapping("/account/login")
	public String login2(Model model) {
		String un = paramService.getString("txtUsername", "");
		String pw = paramService.getString("txtPassword", "");
		boolean rm = paramService.getBoolean("remember", false);
		sessionService.set("username", un);
		if(un.equals("poly") && pw.equals("123")) {
			if(rm) {
				cookieService.add("username", un, 10);
				cookieService.add("password", pw, 10);
			}				
			else {
				cookieService.remove("username");
				cookieService.remove("password");
			}
			model.addAttribute("username", un);
			model.addAttribute("password", pw);
			return "user/info";
		}
		model.addAttribute("message", "Sai thông tin đăng nhập !");
		return "account/login";
	}
	
	@GetMapping("/account/logout")
	public String logout() {
		sessionService.remove("username");
		return "account/login";
	}
}
