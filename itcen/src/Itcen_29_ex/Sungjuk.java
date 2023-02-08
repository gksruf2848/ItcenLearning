package Itcen_29_ex;

public interface Sungjuk {
	void Tot(int kor, int eng, int mat);
	void Avg(int kor, int eng, int mat);
	void Pass(int kor, int eng, int mat);
	
	default void print() {
		System.out.println("=============================");
	}
	
	static void Even(int x) {
		if(x % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
}
