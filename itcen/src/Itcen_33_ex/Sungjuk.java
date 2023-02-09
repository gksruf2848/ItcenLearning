package Itcen_33_ex;

public class Sungjuk implements AA, BB, CC {

	@Override
	public void Pass(int kor, int eng) {
		if(((kor+eng)/2.0)>=60) {
			System.out.println("합격여부 : 합격");
		} else System.out.println("합격여부 : 불합격");
	}

	@Override
	public void Avg(int kor, int eng) {
		System.out.println("평균 : " + ((kor+eng)/2));
	}

	@Override
	public void Tot(int kor, int eng) {
		System.out.println("총점 : " + (kor+eng));
	}
	

}
