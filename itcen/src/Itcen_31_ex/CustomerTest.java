package Itcen_31_ex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Buy b1 = c1;
		b1.buy();
		Sell s1 = c1;
		s1.sell();
		
		c1.buy();
		c1.sell();
		
		if(s1 instanceof Customer) {
			Customer c2 = (Customer) s1;
			c2.buy();
			c2.sell();
		}

	}

}
