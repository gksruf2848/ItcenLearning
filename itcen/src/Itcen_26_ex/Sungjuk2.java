package Itcen_26_ex;

public class Sungjuk2 extends Sungjuk{
	
	public Sungjuk2(int kor, int eng, int mat) {
		super(kor, eng, mat);
	}
	

	public Sungjuk2(String id, String pw) {
		super(id, pw);
	}

	@Override
	public double Avg() {
		return (kor + eng + mat) / 3;
	}


	@Override
	public void Grade() {
		if(Avg()>=60 && kor>=40 && eng>=40 && mat>=40) {
			System.out.println("합격입니다.");
		} else System.out.println("불합격입니다.");
	}
	
	
}
