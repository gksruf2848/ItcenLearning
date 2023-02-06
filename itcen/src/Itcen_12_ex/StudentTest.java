package Itcen_12_ex;

public class StudentTest {

	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st.serialNum);
		System.out.println(Student.serialNum);
		
		Student st2 = new Student();
		System.out.println(st2.serialNum);
		System.out.println(Student.serialNum);
		
	}

}
