package Itcen_13_ex;

public class Calc {
	public static String name;
	public static int kor;
	public static int eng;
	public static int mat;
	
	
	static int tot() {
		return kor+eng+mat;
	}
	
	static double avg() {
		return tot() / 3;
	}
	
	static String grade() {
		if (avg() >= 60 && kor >= 40 && eng >= 40 && mat >= 40) {
			return "합격입니다.";
		} else return "불합격입니다.";
	}
	
	
}
