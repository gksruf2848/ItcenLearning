package test;
import java.util.Scanner;

public class Itcen_06_student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		Student student = new Student();
		student.setName("st1");
		student.setKor(kor);
		student.setEng(eng);
		student.setMat(mat);
		
		double avg = student.avg(kor, eng, mat);
		String hap = student.grade(kor, eng, mat);
		
		System.out.println();
		System.out.println("이름 : " + student.getName());
		System.out.println("국어점수 : " + student.getKor());
		System.out.println("영어점수 : " + student.getEng());
		System.out.println("수학점수 : " + student.getMat());
		System.out.println("평균 : " + avg);
		System.out.println("합격여부 : " + hap);
		
	}

}
