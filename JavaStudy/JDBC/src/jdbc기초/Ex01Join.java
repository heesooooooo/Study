package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01Join {

	public static void main(String[] args) {
		// 사용자 입출력 구간
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 회원가입 ====");
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("이름 입력 : ");
		String b_name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		
		// JDBC(Java Database Connectivity)
		// : JDBC 인터페이스 사용방법
		
		PreparedStatement psmt = null;
		Connection conn = null;
		try {
			// try 구문
			// --> 예외가 발생할 수도 있지만, 우선 시도해보는 구간!
			
			// 1. 드라이버 로딩
			// JDBC 드라이버란?
			// : java에서 제공해주는 인터페이스들을 데이터베이스 회사들에서
			//	 상속을 받아서 로직(몸체)을 구현한 클래스 파일들의 모음
			Class.forName("com.mysql.cj.jdbc.Driver");
			// ---> 반드시, 프로젝트에 jar 파일 넣어주기
			// jar 파일이란?
			// --> 클래스파일들을 여러개 모아놓은 압축파일
			// 프로젝트에 jar 파일 추가하는 방법?
			// 프로젝트 선택 - 마우스 우클릭 - build path 
			// 	- configure build path - libraries 탭 선택
			//	- class path 선택 - 우측 add external jars 선택
			//	- 원하는 jar 파일 경로 선택 - apply and close
			
			// 2. 데이터베이스 연결
			// 준비물 3가지
			// 1) 연결 경로
			String url = "jdbc:mysql://localhost/jdbctest";
			// localhost --> ip주소(127.0.0.1)
			// jdbctest --> 우리가 만든 데이터베이스 이름
			// 2) 계정 이름
			String user = "root";
			// 3) 계정 비밀번호
			String password = "12345";
			
			
			conn = DriverManager.getConnection(url, user, password);
			// Exception으로 바꿔주면 오류 없어짐
			
			// Connection이란?
			// : 데이터베이스에 접속하기 위한 모든 메소드를 가진 인터페이스
			// ---> 데이터베이스와 하는 모든 통신은 conn을 통해서만 이루어진다
			// Connection == MetaData
			// ---> 사용 가능한 테이블 목록, 컬럼들에 대한 정보 등
			// 연결된 데이터베이스의 정보들을 모두 가지고 있음
			
			if(conn != null) {
				System.out.println("연결 성공!");
			}else {
				System.out.println("연결 실패....");
			}
			// 연결됐는지 확인하려고 한 거.. 개발자들만 보는
			
			
			// 3. Query(SQL구문) 전송
			// 3-1) Query문 작성
			String sql = "INSERT INTO JDBCTEST.BIGDATAMEMBER VALUES (?,?,?,?,?)";
			
			// ? 인자
			// : 사용자로부터 어떤 데이터가 들어올지 모를떄 사용
			// : 지정한 데이터 공간만큼 비워놓고 실행하기 전까지 대기
			psmt = conn.prepareStatement(sql);
			// psmt라는 수레 안에 쿼리문 담아서 conn통로 통해 db로 보낸다.
			
			// ? 인자를 채우는 작업
			// 1부터 시작한다.. 인덱스랑 헷갈리지 말기
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, b_name);
			psmt.setInt(4, age);
			psmt.setInt(5, score);
			
			// 4. sql문 실행
			int row = psmt.executeUpdate();
			// excuteUpdate 메소드 : insert, delete, update에 사용
			
			// 5. 결과를 이용한 작업처리
			// : 사용자에게 어떤 모습을 보여주는지 정의
			if(row > 0) {
				System.out.println("회원가입 성공~~");
			}else {
				System.out.println("회원가입 실패 ㅠㅠ");
			}
			// row 행.. 회원가입 되면 하나 추가니까 >0로 확인
			
			
			
			
		} catch (Exception e) {  // 예외상황을 e에 넣어준다
			// } catch (ClassNotFoundException | SQLException e) {
			// ---> 모든 예외클래스는 Exception(부모클래스)을 상속받는다 
			// 			둘 다 잡기 (앞에 지우고 exception만 남김)
			// ---> Exception e = new ClassNotFoundException();
			// ------> 업캐스팅이 일어나는 개념!
			
			// catch 구문
			// --> 예외가 발생했을 때, 어떤 로직을 수행할 지 작성하는 구간!
			// --> () 안쪽에 있는 매개변수는, 어떤 예외상황을 잡아줄건지 기술하는 공간!
			e.printStackTrace();
			// 예외상황이 왜 발생했고, 어디서 문제가 나고있는지
			// 출력해주는 구문!! ---> 개발할때만 사용하기
			// ---> 배포할 때는 삭제하는 것이 좋음! (그럼 멈추기만 함)
		} finally {
			// 위에서 예외상황이 발생하더라도 반드시 한번은 들어오는 구간
			// 6. DB연결 종료 --> 자원 반납
				try {
					// ★★★자원을 반납할 때는 항상 사용한 순서의 역순으로 반납한다!★★★
					// if 하나만 쓸 때 중괄호 생략...
					if(psmt != null) 
						psmt.close();
					if(conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
	}


