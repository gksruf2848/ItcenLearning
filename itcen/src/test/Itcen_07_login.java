package test;
import java.util.Scanner;

public class Itcen_07_login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("### 메 뉴 ###");
		System.out.println("1. idCheck()");
		System.out.println("2. idCheck2()");
		System.out.print("번호 입력 : ");
		int num = sc.nextInt();
		
		Login login = new Login();
		
		switch(num) {
		case 1:
			System.out.print("아이디 입력 : ");
			String id = sc.next();
			System.out.print("암호 입력 : ");
			String pw = sc.next();
			
			boolean ret = login.idCheck(id, pw);
			if (ret = true) {
				System.out.println("로그인 성공");
			} else System.out.println("로그인 실패");
			break;
		case 2:
			login.idCheck2();
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
