package Itcen_27_ex;

public class CalTest {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		ComplateCalc calc = new ComplateCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();

	}

}
