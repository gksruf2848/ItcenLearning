package Itcen_20_ex;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	ArrayList<Subject> subjectList;
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject sj = new Subject(name, score);
		subjectList.add(sj);
	}
	
	public void showStudentInfo() {
		int tot = 0;
		for(Subject s : subjectList) {
			tot += s.getScorePoint();
			System.out.println("학생 " + studentID + "의 " + s.getName() + " 과목 성적은 " + s.getScorePoint() + "입니다.");
		}
		System.out.println("학생 " + studentID + "의 총점은 " + tot + "입니다.");
	}

}
