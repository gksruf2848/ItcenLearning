package test;

import java.util.Scanner;

public class Itcen_04_Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		
		System.out.println(Check1(id,pw));
		
		Check2(id,pw);
		
		
	}
	
	public static String Check1(String id, String pw) {
		if (id.equals("admin") && pw.equals("1111")) {
			return "로그인 성공";
		}
		return "로그인 실패";
	}
	
	public static void Check2(String id, String pw) {
		if (id.equals("admin") && pw.equals("1111")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
	
}
