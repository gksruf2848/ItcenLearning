package test;

public class Sungjuk {
	String name;
	int kor;
	int eng;
	int mat;
	
	public Sungjuk(String pname, int pkor, int peng, int pmat) {
		name = pname;
		kor = pkor;
		eng = peng;
		mat = pmat;
	}
	
	public int tot(int a, int b, int c) {
		return a+b+c;
	}
	
	public double avg(int a, int b, int c) {
		return tot(a,b,c) / 3;
	}
	
	public String hap(int a, int b, int c) {
		if (avg(a,b,c) >= 60 && a >= 40 && b >= 40 && c >= 40) {
			return "합격";
		} else return "불합격";
	}
	
	public void print() {
		int tot = tot(this.kor, this.eng, this.mat);
		double avg = avg(this.kor, this.eng, this.mat);
		String hap = hap(this.kor, this.eng, this.mat);
		
		System.out.println("=====================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("=====================================================");
		System.out.println(this.name + "\t" + this.kor + "\t" + this.eng + "\t" + this.mat + "\t" + tot + "\t" + avg + "\t" + hap);
		
	}
}
