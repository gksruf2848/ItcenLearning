package test;
import java.util.Scanner;

public class Itcen_01_gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		System.out.println("######################");
		System.out.println("1. 구구단 출력");
		System.out.println("2. 성적 처리");
		System.out.println("3. 1-100까지의 3 또는 4의 배수의 합");
		System.out.println("######################");
		System.out.print("메뉴 선택 : ");

		menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			int dan;
			System.out.print("단 입력 : ");
			dan = sc.nextInt();
			
			for(int i=1; i<10; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);
			}
			break;
			
		case 2:
			int kor, eng, mat, tot;
			double avg;
			
			System.out.print("국어 점수 입력 : ");
			kor = sc.nextInt();
			System.out.print("영어 점수 입력 : ");
			eng = sc.nextInt();
			System.out.print("수학 점수 입력 : ");
			mat = sc.nextInt();
			
			tot = kor + eng + mat;
			avg = tot / 3;
			
			System.out.println("총점 : " + tot);
			System.out.println("평균 : " + avg);
			break;
			
		case 3:
			int sum = 0;
			for(int i=0; i<101; i++) {
				if (i%3==0 || i%4==0) {
					sum += i;
				}
			}
			System.out.print("1부터 100까지 3 또는 4의 배수의 합 : " + sum);
			break;
			
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}

}
