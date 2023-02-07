package test;

public class EnhancedForLoop {
	public static void main(String[] args) {
		String[] strArray = {"a", "b", "c", "d", "e"};
		
		for(String alphabet: strArray) {
			System.out.println(alphabet);
		}
	}
}
