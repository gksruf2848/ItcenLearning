package Itcen_23_ex;

public class ChildExample {

	public static void main(String[] args) {
		Child ch1 = new Child();
		ch1.name = "임한결";
		ch1.num2 = 100;
		
		ch1.print(); //재정의
		ch1.print2();
		ch1.print3();
		
		Parent p1 = new Child();
		
		p1.name = "임한결";
		p1.print();
		p1.print2();
		
		Child ch2 = (Child)p1;
	}

}
