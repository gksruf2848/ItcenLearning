package Itcen_26_ex;

public class SungjukExample {

	public static void main(String[] args) {
		Sungjuk sj = new Sungjuk2(70, 60, 50);
		Sungjuk sj2 = new Sungjuk2("admin", "1234");
		
		System.out.println("평균 : " + sj.Avg());
		sj.Grade();
		sj2.IdCheck();
	}

}
