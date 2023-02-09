package Itcen_32_ex;

public class Salary implements TaxInterface {

	@Override
	public void Tax(int salary) {
		int sil = (int)(salary - (salary * RATE));
		System.out.println("세금 : " + sil);
	}
	
	public void Tax2(int salary) {
		int sil = (int)(salary - ((salary * RATE)+(salary * RATE) * 0.1));
		System.out.println("지방세 : " + sil);
	}

}
