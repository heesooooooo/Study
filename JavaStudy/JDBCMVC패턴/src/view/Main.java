package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;

public class Main {

	public static void main(String[] args) {
		// 디자인 패턴 : 계속 같은 문제가 발생해서, 이 문제를 해결하고자
		// 형식, 규칙을 지정해 놓은 것
		// MVC 패턴
		// Model : 데이터를 저장하거나, 조작하기 위한 코드들의 모음
		// View : 사용자에게 직접 보여지는 부분
		// Controller : 실제 기능이 일어나는 부분

		// 1,2,3,4,5 외의 번호 누르면 프로그램 종료
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 빅데이터반 회원관리 프로그램 =====");

		while (true) {

			System.out.print("[1]회원가입 [2]로그인 [3]회원삭제 [4]회원정보조회 [5]회원정보수정 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("==== 회원가입 ====");
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				System.out.print("점수 입력 : ");
				int score = sc.nextInt();

				// 데이터베이스에 접근해서 데이터 추가하기
				// --> 앞으로 데이터베이스에 접근과 관련된 모든 역할은 DAO 담당!
				// 1) DAO 꺼내오기
				MemberDAO dao = new MemberDAO();
				// 2) dao에게 보내줄 데이터 한번에 묶기
				MemberDTO dto = new MemberDTO(id, pw, name, age, score);

				// 3) 회원가입 기능 사용하기
				int row = dao.join(dto);

				if (row > 0) {
					System.out.println("회원가입 성공~~");
				} else {
					System.out.println("회원가입 실패 ㅠㅠ");
				}

			} else if (choice == 2) {

				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();

				// DAO에 있는 로그인 기능 사용
				MemberDAO dao = new MemberDAO();
				// DAO 객체 만들기
				MemberDTO dto = dao.login(id, pw);
				// 로그인한 아이디의 이름,나이 받아오기.. dto에 있는

				// 로그인 성공유무 판단
				if (dto != null) {
					// 로그인 성공했을 때
					System.out.println(dto.getName() + "(" + dto.getAge() + ")님 환영합니다.");
				} else {
					// 로그인 실패했을 때
					System.out.println("로그인에 실패했습니다.");
					System.out.println("아이디와 비밀번호를 확인해주세요");
				}

			} else if (choice == 3) {

				System.out.print("탈퇴할 ID 입력 : ");
				String id = sc.next();
				System.out.print("탈퇴할 ID의 PW 입력 : ");
				String pw = sc.next();

				// DAO에 있는 회원 탈퇴 기능 사용
				MemberDAO dao = new MemberDAO();
				int row = dao.delete(id, pw);

				if (row>0) {
					System.out.println("가지마세요..."); // 탈퇴 성공
				} else {
					System.out.println("어딜도망가"); // 탈퇴 실패
				}

			} else if (choice == 4) {
				System.out.println("ID\t이름\t나이\t점수");
				System.out.println("=======전체 회원 조회=======");
				
				// DAO에 있는 전체회원조회 메소드 사용
				MemberDAO dao = new MemberDAO();
				ArrayList<MemberDTO> result = dao.selectAll();

				// for each로
				for(MemberDTO d : result) {
					System.out.println( d.getId()  + "\t" + d.getName() 
							+ "\t" + d.getAge() + "\t" + d.getScore() );
				}
				
				
//				for(int i=0; i<result.size(); i++) {
//					System.out.println( result.get(i).getId()  + "\t" + result.get(i).getName() 
//							+ "\t" + result.get(i).getAge() + "\t" + result.get(i).getScore() );
//				}
				
				
				

			} else if (choice == 5) {
				System.out.println("==== 회원정보 수정 ====");
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				System.out.print("수정할 점수 입력 : ");
				int score = sc.nextInt();
				
				// dao 객체 생성
				MemberDAO dao = new MemberDAO();
				MemberDTO dto = new MemberDTO(score, id, pw);
				int row = dao.update(dto);

				if (row > 0) {
					System.out.println("점수 수정이 완료되었습니다.");
				} else {
					System.out.println("점수 수정 실패");
					System.out.println("아이디나 비밀번호를 다시 확인해주세요");
				}
				
				
			} else {
				break;
			}

		}

	}

}
