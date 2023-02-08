package Itcen_30_ex;

public class RemoteExample {

	public static void main(String[] args) {
		RemoteInterface rm = new Remote01();
		
		int kor = 90;
		int eng = 92;
		int mat = 84;
		
		rm.Sungjuk(kor,eng,mat);
		rm.Gugudan(5, 7);
		
		rm.K(123);
	}

}
