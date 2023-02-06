package Itcen_15_ex;
import java.util.Scanner;

public class Arrray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jumsu[] = new int[5];
		int sum = 0;
		int max = 0;
		int min = 100;
		
		for(int i=0; i<jumsu.length; i++) {
			System.out.print("점수 입력 : ");
			jumsu[i] = sc.nextInt();
			sum += jumsu[i];
			if (jumsu[i] > max) {
				max = jumsu[i];
			}
			if (jumsu[i] < min) {
				min = jumsu[i];
			}
		}
		
		System.out.println("출력양식");
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + ((double)sum/5));
		System.out.println("최고점수 : " + max);
		System.out.println("최저점수 : " + min);
	}

}
