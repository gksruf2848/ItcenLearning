package Itcen_32_ex;

public class SalaryExample {

	public static void main(String[] args) {
		TaxInterface t1 = new Salary();
		t1.Tax(20000);
		
		Salary s1 = (Salary)t1;
		s1.Tax(20000);
		s1.Tax2(20000);
		

	}

}
