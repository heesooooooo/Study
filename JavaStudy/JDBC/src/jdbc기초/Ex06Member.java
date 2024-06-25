package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex06Member {

	public static void main(String[] args) {
		// 1,2,3,4,5 외의 번호 누르면 프로그램 종료
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 빅데이터반 회원관리 프로그램 =====");
		
		while(true) {
		
		System.out.print("[1]회원가입 [2]로그인 [3]회원삭제 [4]회원정보조회 [5]회원정보수정 >> ");
		int choice = sc.nextInt();
		
		if(choice==1) {
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
			
			PreparedStatement psmt = null;
			Connection conn = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost/jdbctest";
				String user = "root";
				String password = "12345";
				conn = DriverManager.getConnection(url, user, password);
				if(conn != null) {
					System.out.println("연결 성공!");
				}else {
					System.out.println("연결 실패....");
				}
				String sql = "INSERT INTO JDBCTEST.BIGDATAMEMBER VALUES (?,?,?,?,?)";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, id);
				psmt.setString(2, pw);
				psmt.setString(3, b_name);
				psmt.setInt(4, age);
				psmt.setInt(5, score);
				
				int row = psmt.executeUpdate();
				if(row > 0) {
					System.out.println("회원가입 성공~~");
				}else {
					System.out.println("회원가입 실패 ㅠㅠ");
				}
			} catch (Exception e) {  // 예외상황을 e에 넣어준다
				e.printStackTrace();
			} finally {
					try {
						if(psmt != null) 
							psmt.close();
						if(conn != null)
							conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
		} else if(choice==2) {
			
			System.out.print("ID 입력 : ");
			String id = sc.next();
			System.out.print("비밀번호 입력 : ");
			String pw = sc.next();
			
			Connection conn = null;
			PreparedStatement psmt = null;
			ResultSet rs = null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost/jdbctest";
				String user = "root";
				String password = "12345";
				
				conn = DriverManager.getConnection(url, user, password);
				
				if(conn != null) {
					System.out.println("DB 연결 성공");
				}else {
					System.out.println("DB 연결 실패");
				}
				
				String sql = "SELECT * FROM JDBCTEST.BIGDATAMEMBER WHERE ID = ? AND PW = ? ";
				
				psmt = conn.prepareStatement(sql);
				
				psmt.setString(1, id);
				psmt.setString(2, pw);
			
				rs = psmt.executeQuery();
				
				if(rs.next() == true) {
					String name = rs.getString("b_name");
					int age = rs.getInt("age");
					System.out.println(name+"("+age+")님 환영합니다.");
				}else {
					System.out.println("로그인에 실패했습니다.");
					System.out.println("아이디와 비밀번호를 확인해주세요");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(rs != null)
					rs.close();
					if(psmt != null)
					psmt.close();
					if(conn != null)
					conn.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} else if(choice==3) {
			
			System.out.print("탈퇴할 ID 입력 : ");
			String id = sc.next();
			System.out.print("탈퇴할 ID의 PW 입력 : ");
			String pw = sc.next();
			
			Connection conn = null;
			PreparedStatement psmt = null;
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String url = "jdbc:mysql://localhost/jdbctest";
				String user = "root";
				String password = "12345";
				
				conn = DriverManager.getConnection(url, user, password);
				
				String sql = "DELETE FROM JDBCTEST.BIGDATAMEMBER WHERE ID = ? AND PW = ? ";
				
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, id);
				psmt.setString(2, pw);
				
				int row = psmt.executeUpdate();
				
				if(row>0) {
					System.out.println("가지마세요..."); // 탈퇴 성공
				} else {
					System.out.println("어딜도망가"); // 탈퇴 실패
				}
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(psmt != null)
						psmt.close();
					if(conn != null)
						conn.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			
		} else if(choice==4) {
			Connection conn = null;
			PreparedStatement psmt = null;
			ResultSet rs = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String url = "jdbc:mysql://localhost/jdbctest";
				String user = "root";
				String password = "12345";
				
				conn = DriverManager.getConnection(url, user, password);
				
				String sql = "SELECT * FROM JDBCTEST.BIGDATAMEMBER";
				psmt = conn.prepareStatement(sql);
				
				rs = psmt.executeQuery();
				
				System.out.println("=======전체 회원 조회=======");
				System.out.println("ID\t이름\t나이\t점수");
				
				while(rs.next()) {
					String id = rs.getString("id");
					String name = rs.getString("b_name");
					int age = rs.getInt("age");
					int score = rs.getInt("score");
					
					System.out.println(id + "\t" + name + "\t" + age + "\t" + score);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
				if(rs != null)
					rs.close();
				if(psmt != null)
					psmt.close();
					if(conn != null)
					conn.close();
				
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
			}
			
			
		} else if(choice==5) {
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
			
			
		}else {
			break;
		}
		
		}
		
		
		
		
	}

}
