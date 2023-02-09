package Itcen_35_ex;
import java.sql.*;

public class Project {

	public static void main(String[] args) {
		Statement stmt; //쿼리를 처리해주는 역할
		ResultSet rs;
		String sql;
		
		try {
			// MySQL DB용 드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// DB연결 
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root", "1111");
			//System.out.println("mysql db 연결 성공");
			
			stmt = conn.createStatement();
			
			/*
			/////////////////// 데이터 삽입
			sql = "insert into member1 values('hanlim','gksruf',24)";
			stmt.executeUpdate(sql);
			System.out.println("데이터 삽입 성공");
			
			/////////////////// 데이터 조회
			sql = "select * from member1";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("아이디 : " + rs.getString("id"));
				System.out.println("암호 : " + rs.getString("pw"));
				System.out.println("나이 : " + rs.getInt("age"));
			}
			
			/////////////////// 데이터 수정
			sql = "update member1 set pw='gusgh', age=100 where id='hanlim'";
			stmt.executeUpdate(sql);
			System.out.println("데이터 수정 성공");
			
			/////////////////// 데이터 삭제
			sql = "delete from member1 where id='hanlim'";
			stmt.executeUpdate(sql);
			System.out.println("데이터 삭제 성공");
			
			*/
			// DB연결해제 
			conn.close();
			//System.out.println("mysql 연결해제 성공");
		}
		catch(ClassNotFoundException error) {
			System.out.println("mysql driver 미설치 또는 드라이버 이름 오류");
		}
		catch(SQLException error) {
			System.out.println("DB접속오류");
		}
	}

}
