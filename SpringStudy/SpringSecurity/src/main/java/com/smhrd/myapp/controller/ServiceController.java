package com.smhrd.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.smhrd.myapp.dto.MemberDTO;
import com.smhrd.myapp.entity.Member;
import com.smhrd.myapp.repo.MemberRepository;

@Controller
public class ServiceController {

	@Autowired
	private MemberRepository repo;
	@Autowired
	private PasswordEncoder encoder; // --> SecurityConfiguration에 만들어놓음.
	
	@PostMapping("/join-process")
	public String joinProcess(MemberDTO dto){
		Member entity = new Member(dto.getUserid(), dto.getPw(), "user", encoder);
		// 회원가입하면 role 기본적으로 user
		repo.save(entity);
		
		return "redirect:/";
	}
	
	
	@PostMapping("/login-process")
	public String loginProcess(MemberDTO dto) {
		Member entity = repo.findByUseridAndPw(dto.getUserid(), dto.getPw());
		if(entity != null) {
			return "redirect:/dashboard";
		}
		return "redirect:/";
	}
	
}
