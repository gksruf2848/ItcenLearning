package Itcen_30_ex;

public interface RemoteInterface {
	void Sungjuk(int kor, int eng, int mat);
	void Gugudan(int dan, int su);
	
	default void K(int su) {
		int sum = 0;
		for(int i=1; i<=su; i++) {
			if(i%3 ==0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합 : " + sum);
	}
	
}
