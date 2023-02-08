package Itcen_29_ex;

public class SungjukExample {

	public static void main(String[] args) {
		Sungjuk rc = new Sung();
		
		int kor = 70;
		int eng = 60;
		int mat = 80;
		
		rc.Tot(kor, eng, mat);
		rc.Avg(kor, eng, mat);
		rc.Pass(kor, eng, mat);
		
		rc.print();
		
		Sungjuk.Even(20);
		Sungjuk.Even(55);
		

	}

}
