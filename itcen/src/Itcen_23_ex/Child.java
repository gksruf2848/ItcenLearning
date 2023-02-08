package Itcen_23_ex;

public class Child extends Parent{
	int num2;
	
	@Override
	void print() {
		System.out.println("자식 메소드 호출");
	}
	
	void print3() {
		System.out.println("자식 메소드3 호출");
	}
}
