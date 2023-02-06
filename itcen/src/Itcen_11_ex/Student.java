package Itcen_11_ex;

public class Student {
	String name;
	int kor;
	int eng;
	int mat;
	String id;
	String pw;
	
	public Student() {};
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public Student(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public void sungjuk(Sungjuk s1) {
		s1.Tot(this.kor, this.eng, this.mat);
		s1.Avg(this.kor, this.eng, this.mat);
	}
	
	public void idcheck(idCheck id1) {
		id1.check(id,pw);
	}
	
	
}
