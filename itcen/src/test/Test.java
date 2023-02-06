package test;

public class Test {
	String name;
	int age;
	
	Test() {
		this("임한결", 200);
	}
	
	public Test(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(this);
	}
	
	Test result() {
		return this;
	}
}
