package Itcen_37_ex;
import java.sql.*;
import java.util.Scanner;


//미완성인 코드입니다.
public class Project {

	public static void main(String[] args) {
		Statement stmt;
		ResultSet rs;
		Scanner sc = new Scanner(System.in);
		
		try {
			// MySQL DB용 드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// DB연결
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root", "1111");
			stmt = conn.createStatement();
			
			while(true) {
				System.out.println("====== 상품 관리 프로그램 ======");
                System.out.println("1) 상품 등록");
                System.out.println("2) 상품 목록 출력");
                System.out.println("3) 원하는 상품 검색");
                System.out.println("4) 상품 정보 삭제");
                System.out.println("5) 상품 정보 변경");
                System.out.println("6) 상품 총액 순위");
                System.out.println("7) 종료");
                System.out.println("==========================");
                System.out.print("번호> ");
                int act = sc.nextInt();
                
                String work;
                String sql;
                
            	System.out.println();

                if(act == 1) {
                	//상품 등록
                	System.out.println("상품을 등록합니다.");
                	System.out.print("상품코드를 입력해 주세요.> ");
                	int pcode = sc.nextInt();
                	System.out.print("상품명을 입력해 주세요.> ");
                	String pname = sc.next();
                	System.out.print("가격을 입력해 주세요.> ");
                	int price = sc.nextInt();
                	System.out.print("수량을 입력해 주세요.> ");
                	int amount = sc.nextInt();
                	// tot 계산
                	int tot = price * amount;
                	
                	sql = "insert into product values("+pcode+", '"+pname+"', "+price+", "+amount+", "+tot+")";
                	stmt.executeUpdate(sql); //db에 삽입
                	System.out.println(pname + " 상품 등록 완료");
                	System.out.println();
                }
                else if(act == 2) {
                	//상품 목록 출력
                	sql = "select * from product";
                	rs = stmt.executeQuery(sql);
                	System.out.println("상품코드\t상품명\t가격\t수량\t총액");
                	while(rs.next()) {
                		System.out.print(rs.getInt("pcode"));
                		System.out.print("\t"+rs.getString("pname"));
                		System.out.print("\t"+rs.getInt("price"));
                		System.out.print("\t"+rs.getInt("amount"));
                		System.out.print("\t"+rs.getInt("tot"));
                		System.out.println();
                	}
                	System.out.println();
                }
                
                else if(act == 3) {
                	//원하는 상품 검색
                	System.out.println("상품을 검색합니다.");
                	System.out.println("1.상품코드로 검색 2.상품명으로 검색");
                	System.out.print("입력> ");
                	int num = sc.nextInt();
                	
                	if(num == 1) {
                		System.out.print("상품코드 입력> ");
                		int s = sc.nextInt();
                		sql = "select * from product where pcode = " + s;
                	} else if(num == 2) {
                		System.out.print("상품명 입력> ");
                		String s = sc.next();
                		sql = "select * from product where pname = '" + s + "'";                		
                	} else {
                		System.out.println("잘못된 입력입니다.");
                		continue;
                	}
                	rs = stmt.executeQuery(sql);
                	while(rs.next()) {
                		System.out.print(rs.getInt("pcode"));
                		System.out.print("\t"+rs.getString("pname"));
                		System.out.print("\t"+rs.getInt("price"));
                		System.out.print("\t"+rs.getInt("amount"));
                		System.out.print("\t"+rs.getInt("tot"));
                		System.out.println();
                	}
                	
                	System.out.println();

                }
                else if(act == 4) {
                	//상품 정보 삭제
                	System.out.println("상품 정보를 삭제합니다.");
                	System.out.print("삭제하실 상품코드를 입력하세요.> ");
                	int num = sc.nextInt();
                	
                	sql = "delete from product where pcode = "+num;
                	stmt.executeUpdate(sql);
                	System.out.println("삭제 완료");
                	
                	System.out.println();

                }
                else if(act == 5) {
                	//상품 정보 변경
                	System.out.println("상품 정보를 변경합니다.");
                	System.out.print("변경할 상품의 코드를 입력하세요.> ");
                	int num = sc.nextInt();
                	
                	System.out.println("1.상품명 변경 2.가격 변경 3.수량 변경");
                	System.out.print("입력> ");
                	int num2 = sc.nextInt();
                	
                	if(num2 == 1) {
                		System.out.println("새 상품명 입력> ");
                		sql = "update product set pname = '"+sc.next()+"' where pcode = " + num;
                		stmt.executeUpdate(sql);
                	} else if(num2 == 2) {
                		System.out.println("새 가격 입력> ");
                		sql = "update product set price = '"+sc.nextInt()+"' where pcode = " + num;
                		stmt.executeUpdate(sql);
                		sql = "update product set price = '"+sc.nextInt()+"' where pcode = " + num;
                		stmt.executeUpdate(sql);
                		

                	} else if(num2 == 3) {
                		System.out.println("새 수량 입력> ");
                	} else {
                		System.out.println("잘못된 입력입니다.");
                		continue;
                	}
                	
                	stmt.executeUpdate(sql);
                	System.out.println("변경되었습니다.");
                	
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
