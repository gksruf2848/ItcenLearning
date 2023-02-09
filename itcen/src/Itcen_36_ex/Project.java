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
                	System.out.println("고객정보를 추가합니다.");
                	System.out.print("번호를 입력해 주세요.> ");
                	int unm = sc.nextInt();
                	System.out.print("이름을 입력해 주세요.> ");
                	String uname = sc.next();
                	System.out.print("전화번호를 입력해 주세요.> ");
                	String phone = sc.next();
                	System.out.print("주소를 입력해 주세요.> ");
                	sc.nextLine(); //강제 개행 문자 제거
                	String address = sc.nextLine();
                	
                	sql = "insert into user values("+unm+", '"+uname+"', '"+phone+"', '"+address+"')";
                	stmt.executeUpdate(sql); //db에 삽입
                	System.out.println(uname + "님의 정보 등록 완료");
                }
                else if(act == 2) {
                	//고객정보변경
                	System.out.println("고객 정보를 변경합니다.");
                	System.out.print("변경하실 고객의 번호를 입력하세요.> ");
                	int num = sc.nextInt();
                	
                	System.out.println("1. 이름 변경 2. 전화번호 변경 3. 주소 변경");
                	System.out.print("입력> ");
                	int num2 = sc.nextInt();
                	
                	if(num2 == 1) {
                		work = "uname";
                		System.out.println("새 이름 입력> ");
                		
                	} else if(num2 == 2) {
                		work = "phone";
                		System.out.println("새 번호 입력");
                	} else if(num2 == 3) {
                		work = "address";
                		System.out.println("새 주소 입력");
                	} else {
                		System.out.println("잘못된 입력입니다.");
                		continue;
                	}
                	sc.nextLine();
                	String s = sc.nextLine();
                	
                	sql = "update user set "+work+" = '"+s+"' where unm = " + num;
                	stmt.executeUpdate(sql);
                	System.out.println("변경되었습니다.");
                }
                
                else if(act == 3) {
                	//고객 정보 삭제
                	System.out.println("고객정보를 삭제합니다.");
                	System.out.print("삭제하실 번호를 입력하세요.> ");
                	int num = sc.nextInt();
                	
                	sql = "delete from user where unm = "+num;
                	stmt.executeUpdate(sql);
                	System.out.println("삭제 완료");
                }
                else if(act == 4) {
                	//고객 정보 출력
                	sql = "select * from user";
                	rs = stmt.executeQuery(sql);
                	while(rs.next()) {
                		System.out.print("번호: " + rs.getInt("unm"));
                		System.out.print("\t이름: " + rs.getString("uname"));
                		System.out.print("\t전화번호: " + rs.getString("phone"));
                		System.out.print("\t주소: " + rs.getString("address"));
                		System.out.println();
                	}
                }
                else if(act == 5) {
                	//고객정보 검색
                	System.out.println("고객 정보를 검색합니다.");
                	System.out.println("1. 번호 검색 2. 이름 검색 3. 핸드폰 검색");
                	System.out.print("입력> ");
                	int num = sc.nextInt();
                	
                	if(num == 1) {
                		System.out.print("고객 번호 입력> ");
                		int s = sc.nextInt();
                		sql = "select * from user where unm = " + s;
                	} else if(num == 2) {
                		System.out.print("이름 번호 입력> ");
                		String s = sc.next();
                		sql = "select * from user where uname = '" + s + "'";                		
                	} else if(num == 3) {
                		System.out.print("전화번호 입력> ");
                		String s = sc.next();
                		sql = "select * from user where phone = '" + s + "'";
                	} else {
                		System.out.println("잘못된 입력입니다.");
                		continue;
                	}
                	rs = stmt.executeQuery(sql);
                	while(rs.next()) {
                		System.out.print("번호: " + rs.getInt("unm"));
                		System.out.print("\t이름: " + rs.getString("uname"));
                		System.out.print("\t전화번호: " + rs.getString("phone"));
                		System.out.print("\t주소: " + rs.getString("address"));
                		System.out.println();
                	}
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
