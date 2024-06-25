package com.smhrd.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.smhrd.myapp.entity.MemberEntity;
import com.smhrd.myapp.mapper.MemberMapper;
import com.smhrd.myapp.vo.MemberVO;

import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {
	
	@Autowired
	private MemberMapper mapper;

	// index.jsp를 띄워주는 메소드
	// @RequestMapping()보다 Springboot에서는
	// @get~~ @Post~~ Mapping 으로 권장
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/mypage")
	public String mypage() {
		return "mypage";
	}
	
	@GetMapping("/join")
	public String join() {
		return "join";
	}
	
	@PostMapping("/join-process")
	public String joinProcess(MemberVO vo) {
		System.out.println("수집된 데이터 >> " + vo);
		MemberEntity entity = new MemberEntity(vo);
		mapper.save(entity);
		// update sql구문도 save 처리
		// save(entity)
		// --> entity 안에 idx가 없으면, insert 진행
		// --> entity 안에 idx가 채워져 있으면, update 진행 
		
		
		
		
		return "redirect:/";
	}
	
	@PostMapping("/login")
	// 이 다음 페이지까지 쓸 때 : RedirectAttributes
	public String login(MemberVO vo, RedirectAttributes rttr) {
		MemberEntity entity = mapper.findByIdAndPw(vo.getId(), vo.getPw());
		MemberVO myData = new MemberVO(entity.getId(), entity.getPw(), entity.getName(), entity.getTel());
		rttr.addAttribute("myData", myData.getId());
		// * 주의할 점 : 들어가는 value의 형태를 String으로 변환가능한 형태로 넣어주기
		// redirect:/mypage?myData=test (일회용)
		
		// /login 페이지 유효
		// /mypage 페이지 유효
		return "redirect:/mypage";
	}
	
	
	
	
	
	

// ==================== session 쓰는 거 ====================	
	
//	@PostMapping("/login")
//	public String login(MemberVO vo, HttpSession session) {
//		// MVC에서는 mapper.login(vo);
//		// JPA (mapper == repository)
//		MemberEntity entity = mapper.findByIdAndPw(vo.getId(), vo.getPw());
//		System.out.println("받아온 entity >> " + entity);
//		// mypage.jsp 하나 만들어서
//		// 받아온 사용자의 정보를 pw 빼고 전부 출력
//		// entity(JPA용) --> vo(java, jsp용)로 변경
//		MemberVO myData = new MemberVO(entity.getId(), entity.getPw(), entity.getName(), entity.getTel());
//		// Model : request 경량화 버전
//		// --> 응답을 되돌려주기 전까지만 유효
//		session.setAttribute("myData", myData);
//		// session --> 브라우저 닫히기 전까지 유효
//		
//		return "redirect:/mypage";
//		// 요청2 응답2
//	}
	
	
	
	
	
	
}
