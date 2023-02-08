package Itcen_26_ex;

public abstract class Sungjuk {
	int kor;
	int eng;
	int mat;
	String id;
	String pw;
	
	public Sungjuk(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public Sungjuk(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public abstract double Avg();
	public abstract void Grade();
	
	public void IdCheck() {
		if(id.equals("admin") && pw.equals("1234")) {
			System.out.println("로그인 성공");
		} else System.out.println("로그인 실패");
	}
}
