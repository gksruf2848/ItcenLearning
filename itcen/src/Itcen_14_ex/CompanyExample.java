package Itcen_14_ex;

public class CompanyExample {

	public static void main(String[] args) {
		Company cp = Company.getInstance();
		Company cp2 = Company.getInstance();
		
		System.out.println(cp + " : " + cp2);
		System.out.println(cp == cp2);

	}

}
