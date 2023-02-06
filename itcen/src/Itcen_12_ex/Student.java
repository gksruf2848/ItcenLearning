package Itcen_12_ex;

public class Student {
	public static int serialNum = 1000;
	public String name;
	public int studentID;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}
	
	
}
