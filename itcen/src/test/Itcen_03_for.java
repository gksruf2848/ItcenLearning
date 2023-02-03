package test;
import java.util.Scanner;

public class Itcen_03_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1.
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//2.
		
		//3.
		System.out.println();
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
		
		//4.
		System.out.println();
		System.out.print("성적 입력 : ");
		int score = sc.nextInt();
		String grade;
		
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A0";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B0";
			}
		} else {
			grade = "학점미달";
		}
		System.out.println(grade);
		
		
		//5.
		System.out.println();
		int sum = 0;
		int i = 0;
		while(sum<100) {
			i++;
			sum += 3*i;
		}
		System.out.println("3의 배수의 합이 100을 넘어갈때의 3의 배수 : " + 3*i);
		System.out.println("3의 배수의 합 : " + sum);
	}

}
