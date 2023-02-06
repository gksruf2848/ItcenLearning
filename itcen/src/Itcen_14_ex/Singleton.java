package Itcen_14_ex;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private int kor;
	private int eng;
	
	private Singleton() {};
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void Settot(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}
	
	public int Gettot() {
		return kor+eng;
	}
	
}
