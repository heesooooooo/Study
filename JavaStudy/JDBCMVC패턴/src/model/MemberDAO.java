package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	// Data Access Object : 데이터에 접근하는 것을 도와주는 객체
	// DB 연결해서 insert, delete, update, select 하는 코드들의 모음
	// 메소드 형태로 코드 작성

	// 필드
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	// 공통으로 사용할 메소드
	// 데이터베이스 연결하는 메소드
	private void getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 사용한 자원 반납하는 메소드
	private void getClose() {

		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	
	

	// 회원가입 메소드
	public int join(MemberDTO dto) {
		int row = 0;

		try {

			getConn();
			String sql = "INSERT INTO JDBCTEST.BIGDATAMEMBER VALUES (?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			psmt.setInt(5, dto.getScore());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

	//////////////////////////////////// 회원가입메소드 끝

	// 로그인 메소드
	public MemberDTO login(String id, String pw) {

		MemberDTO dto = null; // 레퍼런스타입이니까 null
		try {
			getConn();
			String sql = "SELECT * FROM JDBCTEST.BIGDATAMEMBER WHERE ID = ? AND PW = ? ";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next() == true) {
				String name = rs.getString("b_name");
				int age = rs.getInt("age");
				// rs에 있는 데이터 DTO 옮기기
				dto = new MemberDTO(null, null, name, age, 0);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return dto;

	}

	///////////////////////////// 로그인 끝

	// 회원 탈퇴 메소드
	public int delete(String id, String pw) {
		int row = 0;
		try {
			getConn();
			String sql = "DELETE FROM JDBCTEST.BIGDATAMEMBER WHERE ID = ? AND PW = ? ";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			row = psmt.executeUpdate();
			// executeUpdate 리턴타입 :int.. 몇개의 행이 삭제됐는지

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return row;

	}

	///////////////////////////// 회원탈퇴 끝

	// 회원전체조회 메소드
	public ArrayList<MemberDTO> selectAll() {
		// 쿼리문에 물음표로 받아올 거 없으니까 매개변수 x
		MemberDTO dto = null;
		ArrayList<MemberDTO> arr = new ArrayList<MemberDTO>();

		try {
			getConn();
			String sql = "SELECT * FROM JDBCTEST.BIGDATAMEMBER";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("b_name");
				int age = rs.getInt("age");
				int score = rs.getInt("score");
				// 조회 결과(rs)에 있는 데이터 DTO로 옮겨 담기
				// 자료형이 다 다르니까 하나로 묶어서 main 보내기 -> dto
				dto = new MemberDTO(id, null, name, age, score);
				// ArrayList 이용해서 dto 여러개 묶어주기
				arr.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return arr;

	}

	/////////////////////////// 회원 전체조회 끝

	// 회원정보수정 메소드

	public int update(MemberDTO dto) {
		int row = 0;
		try {
			getConn();
			String sql = "UPDATE JDBCTEST.BIGDATAMEMBER SET SCORE = ? WHERE ID =? AND PW =?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, dto.getScore());
			// score id pw 빨간줄.. dto에서 가져오기
			psmt.setString(2, dto.getId());
			psmt.setString(3, dto.getPw());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return row;

	}

//	public int update(int nScore, String id, String pw) {
//		
//		Connection conn = null;
//		PreparedStatement psmt = null;
//		MemberDTO dto = null;
//		int row =0;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			String url = "jdbc:mysql://localhost/jdbctest";
//			String user = "root";
//			String password = "12345";
//
//			conn = DriverManager.getConnection(url, user, password);
//
//			String sql = "UPDATE JDBCTEST.BIGDATAMEMBER SET SCORE = ? WHERE ID =? AND PW =?";
//			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, nScore);
//			psmt.setString(2, id);
//			psmt.setString(3, pw);
//
//			row = psmt.executeUpdate();
//		
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (psmt != null)
//					psmt.close();
//				if (conn != null)
//					conn.close();
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//		}
//
//		return row;
//		
//	}

}
