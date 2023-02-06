package Itcen_13_ex;
import java.util.Scanner;

public class CalcExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		Calc.name = sc.next();
		System.out.print("국어 : ");
		Calc.kor = sc.nextInt();
		System.out.print("영어 : ");
		Calc.eng = sc.nextInt();
		System.out.print("수학 : ");
		Calc.mat = sc.nextInt();
		
		System.out.println();
		System.out.println("이름 : " + Calc.name);
		System.out.println("총점 : " + Calc.tot());
		System.out.println("평균 : " + Calc.avg());
		System.out.println("합격여부 : " + Calc.grade());
		
		
	}

}
