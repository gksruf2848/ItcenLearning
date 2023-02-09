package Itcen_35_ex;
import java.sql.*;

public class Project {

	public static void main(String[] args) {
		try {
			// MySQL DB용 드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// DB연결 
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root", "1111");
			System.out.println("mysql db 연결 성공");
			// sql문장
			// DB연결해제 
			conn.close();
			System.out.println("mysql 연결해제 성공");
		}
		catch(ClassNotFoundException error) {
			System.out.println("mysql driver 미설치 또는 드라이버 이름 오류");
		}
		catch(SQLException error) {
			System.out.println("DB접속오류");
		}
	}

}
