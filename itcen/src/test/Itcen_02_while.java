package test;

import java.util.Scanner;

public class Itcen_02_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			int menu;
			
			System.out.println("#####  메     뉴  #####");
			System.out.println("1. 1-100까지의 합");
			System.out.println("2. 로그인 처리");
			System.out.println("0. 종료");
			System.out.println("######################");
			System.out.print("메뉴 선택 : ");

			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				int i = 1;
				int hol = 0;
				int jjak = 0;
				while(i < 101) {
					if (i%2==0) jjak += i;
					else hol += i;
					i++;
				}
				System.out.println("홀수의 합 : " + hol);
				System.out.println("짝의 합 : " + jjak);
				break;
				
			case 2:
				String id, pw;
				
				while(true) {
					System.out.print("관리자 id : ");
					id = sc.next();
					System.out.print("암호 : ");
					pw = sc.next();
					
					if(id.equals("admin") && pw.equals("1111")) {
						System.out.println("id : admin / pw : 1111 (로그인 성공)");
						break;
					} else {
						System.out.println("id : " + id + " / pw : " + pw + "(로그인 실패)");					
					}
				}			
				break;
			case 0:
				System.out.println("종료되었습니다.");
				flag = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
