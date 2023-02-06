package Itcen_11_ex;

public class idCheck {
	String result;
	
	public void check(String id, String pw) {
		if (id.equals("admin") && pw.equals("1111")) {
			result = "로그인 성공";
		} else result = "로그인 실패";
	}
	
	public void showinfo() {
		System.out.println("로그인 결과 : " + result);
	}
	
}
