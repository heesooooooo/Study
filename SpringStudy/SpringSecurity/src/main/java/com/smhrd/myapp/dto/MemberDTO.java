package com.smhrd.myapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {

	// java안에서 사용할 데이터 교환용 자료형
	private Long id;
	private String userid;
	private String pw;
	private String role;
}
