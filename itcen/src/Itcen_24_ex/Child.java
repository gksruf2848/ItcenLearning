package Itcen_24_ex;

public class Child extends Parent{
	
	int mat;
	
	@Override
	void Avg1() {
		double avg;
		avg = (kor + eng + this.mat) / 3;
		System.out.println("자식평균 : " + avg);
	}
	
	void Tot2() {
		int tot;
		tot = kor + eng + mat;
		System.out.println("자식총점 : " + tot);
	}
	
	
}
