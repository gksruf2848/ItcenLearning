package Itcen_18_ex;
import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		Student[] st1 = new Student[5];
		
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<st1.length; i++) {
			st1[i] = new Student();
			System.out.print("이름 : ");
			st1[i].setName(sc.next());
			System.out.print("국어 : ");
			st1[i].setKor(sc.nextInt());
			System.out.print("영어 : ");
			st1[i].setEng(sc.nextInt());
		}
		
		for(int i=0; i<st1.length; i++) {
			st1[i].showInfo();
		}
	}
}
