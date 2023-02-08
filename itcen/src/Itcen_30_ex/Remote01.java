package Itcen_30_ex;

public class Remote01 implements RemoteInterface {

	@Override
	public void Sungjuk(int kor, int eng, int mat) {
		int tot = kor+eng+mat;
		double avg = tot / 3.0;
		
		if(avg >= 90) {
			System.out.println("학점 : A");
		} else if(avg >= 80) {
			System.out.println("학점 : B");
		} else {
			System.out.println("학점 : F");
		}
	
	}

	@Override
	public void Gugudan(int dan, int su) {
		for(int i=1; i<=su;i++) {
			for(int j=1; j<=dan; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}
	}
	

}
