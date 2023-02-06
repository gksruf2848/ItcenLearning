package Itcen_11_ex;

public class Itcen_11_studentExample {

	public static void main(String[] args) {
		Student st = new Student("hanlim",100,80,60);
		Sungjuk s1 = new Sungjuk();
		st.sungjuk(s1);
		s1.showinfo();
		
		Student st2 = new Student("admin", "1111");
		idCheck id1 = new idCheck();
		st2.idcheck(id1);
		id1.showinfo();

	}

}
