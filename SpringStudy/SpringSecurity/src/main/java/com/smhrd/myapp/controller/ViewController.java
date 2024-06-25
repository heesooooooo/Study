package com.smhrd.myapp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smhrd.myapp.repo.MemberRepository;

@Controller
// @RequestMapping("/view") // --> class 단위로 url mapping 부여 가능 
public class ViewController {
	

	@GetMapping("/")
	public String login() {
		return "login";
	}
	
	@GetMapping("/join")
	public String join() {
		return "join";
	}
	
	@GetMapping("/admin")
	// @PreAuthorize("hasAnyRole('admin')") --> Configuration에 있는 거랑 같음 
	public String admin() {
		return "admin";
	}
	
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
	
	
}
