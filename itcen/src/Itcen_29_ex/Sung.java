package Itcen_29_ex;

public class Sung implements Sungjuk {

	@Override
	public void Tot(int kor, int eng, int mat) {
		System.out.println("총점 : " + (kor+eng+mat));
	}

	@Override
	public void Avg(int kor, int eng, int mat) {
		System.out.println("평균 : " + ((kor+eng+mat)/3.0));
	}

	@Override
	public void Pass(int kor, int eng, int mat) {
		if((kor+eng+mat)/3.0 >= 60) {
			System.out.println("합격여부 : 합격");
		} else {
			System.out.println("합격여부 : 불합격");
		}
	}
	

}
