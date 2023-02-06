package Itcen_14_ex;
import java.util.Scanner;

public class SingletonExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Singleton s1 = Singleton.getInstance();
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수: ");
		int eng = sc.nextInt();
		
		s1.Settot(kor, eng);
		System.out.println(s1.Gettot());

	}

}
