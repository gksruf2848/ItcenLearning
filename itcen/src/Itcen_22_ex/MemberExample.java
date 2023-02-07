package Itcen_22_ex;
import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("주민번호 : ");
		String ssn = sc.next();
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		Member2 mb = new Member2(name, ssn, id, pw);
		
		System.out.println("출력 결과");
		System.out.println("이름 : " + mb.name + " 아이디 : " + mb.id + " 비번 : " + mb.pw);
		mb.idCheck();
		
	}

}
