package test;

public class Itcen_10_test {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t);
		t.showInfo();
		
		System.out.println(t.name);
		System.out.println(t.age);
		Test t2 = t.result();
		Test t3 = new Test();
		System.out.println(t);
		System.out.println(t2);
		System.out.println(t3);

	}

}
