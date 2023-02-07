package Itcen_18.ex;

public class Student {
	private String name;
	private int kor;
	private int eng;
	
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
	public void setKor(int kor) { this.kor = kor; }
	public int getKor() { return kor; }
	public void setEng(int eng) { this.eng = eng; }
	public int getEng() { return eng; }
	
	public void showInfo() {
		System.out.println("이름 : " + name + " 국어 : " + kor + " 영어 : " + eng);
	}
	
}
