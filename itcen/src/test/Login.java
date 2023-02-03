package test;
import java.util.Scanner;

public class Login {
	String id;
	String pw;
	
	public boolean idCheck(String id, String pw) {
		if (id.equals("admin") && pw.equals("1111")) {
			return true;
		} else return false;
	}
	
	public void idCheck2() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("아이디 입력 : ");
			String id = sc.next();
			System.out.print("암호 입력 : ");
			String pw = sc.next();
			
			if (id.equals("admin") && pw.equals("1111")) {
				System.out.println("로그인 성공");
				break;
			} else System.out.println("로그인 실패");
		}
	}

}
