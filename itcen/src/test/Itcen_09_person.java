package test;
import java.util.Scanner;

public class Itcen_09_person {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person ps = new Person();
		
		System.out.print("월급 입력 : ");
		ps.setSalary(sc.nextInt());
		
		int t1 = (int)ps.getTax(ps.getSalary());
		int t2 = (int)ps.getTax2(ps.getSalary());
		int tot = t1+t2;
		int sil = ps.getSalary() - tot;
		
		System.out.println("본봉 : " + ps.getSalary());
		System.out.println("소득세 : " + t1);
		System.out.println("지방세 : " + t2);
		System.out.println("총세금 : " + tot);
		System.out.println("실수령액 : " + sil);
		

	}

}
