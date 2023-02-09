package Itcen_36_ex;
import java.sql.*;
import java.util.Scanner;
public class Project {

	public static void main(String[] args) {
		Statement stmt; // sql 쿼리 해주는 역할
		ResultSet rs;
		Scanner sc=new Scanner(System.in);
		//String sql;
		try {
			// MySQL DB용 드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// DB연결 
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root", "1111");
			//System.out.println("mysql db 연결 성공");
			// sql문장
			stmt = conn.createStatement();
			
			while(true) {
            	System.out.println("===== 고객 정보 관리 프로그램 =====");
                System.out.println("1) 고객 정보 추가");
                System.out.println("2) 고객 정보 변경");
                System.out.println("3) 고객 정보 삭제");
                System.out.println("4) 고객 정보 출력");
                System.out.println("5) 고객 정보 검색");
                System.out.println("6) 종료");
                System.out.println("==========================");
                System.out.print("번호: ");
                int act = sc.nextInt();
                String work;
                String sql; 

                if(act == 1) {
                	//고객정보추가
                System.out.println("추가");
                }
                else if(act == 2) {
                	//고객정보변경
               System.out.println("변경");
                }
                else if(act == 3) {
                	//고객 정보 삭제
                System.out.println("삭제");                
                }
                else if(act == 4) {
                	//고객 정보 출력
                System.out.println("출력");	
                }
                else if(act == 5) {
                	//고객정보 검색
                System.out.println("검색");	
                }
                else {
                	System.out.println("프로그램 종료");
                	break;
                }
			
			}
			conn.close();
		
			//System.out.println("mysql 연결해제 성공");
			}
			catch(ClassNotFoundException e) {
			System.out.println("mysql driver 미설치 또는 드라이버 이름 오류");
			}
			catch(SQLException e) {
			System.out.println("DB접속오류");
			}
	}

}
