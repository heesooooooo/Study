package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex05Update {

	public static void main(String[] args) {
		
		// id, pw, 수정할 점수
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 회원정보 수정 ====");
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("수정할 점수 입력 : ");
		int nScore = sc.nextInt();
		
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "UPDATE JDBCTEST.BIGDATAMEMBER SET SCORE = ? WHERE ID =? AND PW =?";
			psmt = conn.prepareStatement(sql);
			// 인자 순서는 맨 위에 입력한 순서 말고 쿼리문에 있는 순서....
			psmt.setInt(1, nScore);
			psmt.setString(2, id);
			psmt.setString(3, pw);
			
			
			int row = psmt.executeUpdate();
			if(row>0) {
				System.out.println("점수 수정이 완료되었습니다.");
			} else {
				System.out.println("점수 수정 실패");
				System.out.println("아이디나 비밀번호를 다시 확인해주세요");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			if(psmt!=null)
					psmt.close();
			if(conn!=null)
					conn.close();
			
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
