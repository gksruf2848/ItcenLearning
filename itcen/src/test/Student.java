package test;

public class Student {
	String name;
	int kor;
	int eng;
	int mat;
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public int getKor() { return kor; }
	public void setKor(int kor) { this.kor = kor; }
	
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	
	public int getMat() { return mat; }
	public void setMat(int mat) { this.mat = mat; }
	
	public double avg(int a, int b, int c) {
		return (a+b+c)/3;
	}

	public String grade(int a, int b, int c) {
		if (avg(a,b,c) >= 60 && a >= 40 && b >= 40 && c >= 40) {
			return "합격";
		} else return "불합격";
	}

}

