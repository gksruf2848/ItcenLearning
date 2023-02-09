package Itcen_31_ex;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("판매");
		
	}

	@Override
	public void buy() {
		System.out.println("구매");
	}

}
