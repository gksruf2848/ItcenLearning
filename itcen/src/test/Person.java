package test;

public class Person {
	final double tax = 0.3;
	private int salary;
	
	public int getSalary() { return salary; }
	public void setSalary(int salary) { this.salary = salary; }
	
	public double getTax(int s) {
		return s*tax;
	}
	
	public double getTax2(int s) {
		return getTax(s)*0.1;
	}
}
