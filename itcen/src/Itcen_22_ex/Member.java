package Itcen_22_ex;

public class Member {
	protected String name;
	protected String ssn;
	protected String id;
	protected String pw;
	
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	void idCheck() {
		if (id.equals("admin") && pw.equals("1111")) {
			System.out.println("로그인 성공");
		} else System.out.println("로그인 실패");
	}
	

}
