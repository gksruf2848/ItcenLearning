package test;
import java.util.Scanner;

public class Itcen_05_grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		int tot = tot(kor,eng,mat);
		double avg = avg(kor,eng,mat);
		String hap = grade(kor,eng,mat);
		
		System.out.println("### 성 적 결 과 ###");
		System.out.println("========================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("========================================================");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+hap);
		
	}
	
	public static int tot(int a, int b, int c) {
		return a+b+c;
	}
	
	public static double avg(int a, int b, int c) {
		return tot(a,b,c)/3;
	}
	
	public static String grade(int a, int b, int c) {
		if (avg(a,b,c) >= 60 && a >= 40 && b >= 40 && c >= 40) {
			return "합격";
		} else return "불합격";
	}

}
