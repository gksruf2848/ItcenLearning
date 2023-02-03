package test;
import java.util.Scanner;

public class Itcen_00_grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id;
		String name;
		int kor;
		int eng;
		int mat;
		String hap;
		char grade = 'F';
		
		System.out.print("아이디 입력 : ");
		id = sc.next();
		
		if (id.equals("admin")) {
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("국어 : ");
			kor = sc.nextInt();
			System.out.print("영어 : ");
			eng = sc.nextInt();
			System.out.print("수학 : ");
			mat = sc.nextInt();
			
			int tot = kor + eng + mat;
			double avg = tot / 3;
			
			if (avg>=60 && kor>=40 && eng>=40 && mat>=40) {
				if (avg>=90) grade = 'A';
				else if (avg>=80 && avg<90) grade = 'B';
				else if (avg>=70 && avg<80) grade = 'C';
				else if (avg>=60 && avg<70) grade = 'D';
				else grade = 'F';
				hap = "합격";
			} else {
				hap = "불합격";
			}
			
			if (kor>=0&&kor<=100&&eng>=0&&eng<=100&&mat>=0&&mat<=100) {
				System.out.println("이름 : " + name);
				System.out.println("총점 : " + tot);
				System.out.println("평균 : " + avg);
				System.out.println("합격여부 : " + hap);
				switch (grade) {
					case 'A':
						System.out.println("학점 : " + 'A'); break;
					case 'B':
						System.out.println("학점 : " + 'B'); break;
					case 'C':
						System.out.println("학점 : " + 'C'); break;
					case 'D':
						System.out.println("학점 : " + 'D'); break;
					default:
						System.out.println("학점 : " + 'F'); break;
				}
			} else {
				System.out.println("잘못된 점수 입력 (0-100점 사이 입력)");
			}
		} else {
			System.out.println("관리자가 아닙니다.");
		}
	}

}
