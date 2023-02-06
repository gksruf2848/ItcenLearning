package Itcen_16_ex;

public class ArrayCopy {

	public static void main(String[] args) {
		int aa[] = new int[10];
		
		for(int i=0;i<aa.length;i++) {
			aa[i] = i+1;
		}
		
		int bb[] = new int[10];
		
		for(int i=0;i<aa.length;i++) {
			bb[aa.length-i-1] = aa[i];
		}
		
		System.out.println("출력결과");
		System.out.println("aa배열 :");
		for(int i=0;i<aa.length;i++) {
			System.out.print(aa[i]);
			if (i != aa.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("bb배열 :");
		for(int i=0;i<bb.length;i++) {
			System.out.print(bb[i]);
			if (i != bb.length-1) {
				System.out.print(", ");
			}
		}

	}

}
