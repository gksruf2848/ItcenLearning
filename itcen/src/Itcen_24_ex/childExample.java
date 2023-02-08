package Itcen_24_ex;

public class childExample {

	public static void main(String[] args) {
		Child ch1 = new Child();
		
		ch1.eng = 50;
		ch1.kor = 70;
		ch1.mat = 80;
		
		ch1.Tot2();
		ch1.Avg1();
		
		Parent p1 = new Child();
		
		p1.eng = 40;
		p1.kor = 50;
		
		p1.Avg1();
		
		Child ch2 = (Child)p1;
		
		ch2.mat = 70;
		ch2.Avg1();
		ch2.Tot2();
		
		Parent p2 = new Parent();
		
		p2.eng = 50;
		p2.kor = 60;
		
		p2.Avg1();

	}

}
