package Itcen_15_ex;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name[] = new String[3];
		int kor[] = new int[3];
		int eng[] = new int[3];
		int tot[] = new int[3];
		double avg[] = new double[3];
		
		for(int i=0;i<name.length;i++) {
			System.out.print("이름 : ");
			name[i] = sc.next();
			System.out.print("국어 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어 : ");
			eng[i] = sc.nextInt();
			
			tot[i] = kor[i] + eng[i];
			avg[i] = (double)tot[i] / 2;
		}
		
		System.out.println("성적표");
		System.out.println("이름\t국어\t영어\t총점\t평균");
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + tot[i] + "\t" + avg[i]);
		}
		
	}

}
