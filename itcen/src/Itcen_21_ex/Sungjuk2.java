package Itcen_21_ex;

public class Sungjuk2 extends Sungjuk{
	private double avg;
	
	public Sungjuk2(String name, int kor, int mat) {
		this.name = name;
		this.kor = kor;
		this.mat = mat;
	}
	
	void Avg() {
		avg = (kor + mat) / 2.0;
		System.out.println("평균 : " + avg);
	}
}
