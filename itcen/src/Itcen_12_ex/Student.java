package Itcen_12_ex;

public class Student {
	public static int serialNum = 1000;
	public static String name;
	public int studentID;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}
	
	static void namePrint() {
		System.out.println(name);
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum() {
		Student.serialNum = serialNum;
	}
}
