package Itcen_25_ex;

public class CoumputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer();
		Computer c2 = new Desktop();
		//Computer c3 = new Notebook);
		Computer c4 = new MyNotebook();
		c2.display();
		c2.typing();
		c2.turnOn();
		c2.turnOff();

	}

}
