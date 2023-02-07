package Itcen_20_ex;

public class ArrayListEx {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 100);
		
		Student studentKim = new Student(1002, "Lee");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("========================");
		studentKim.showStudentInfo();
	
	}

}
