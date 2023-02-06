package Itcen_11_ex;

public class Sungjuk {
	int tot;
	double avg;
	
	public void Tot(int kor, int eng, int mat) {
		tot = kor + eng + mat;
	}
	
	public void Avg(int kor, int eng, int mat) {
		avg = (kor + eng + mat) / 3;
	}
	
	public void showinfo() {
		System.out.println("총점 : " + tot + " 평균 : " + avg);
	}
}
