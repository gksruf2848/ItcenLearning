package Itcen_17_ex;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> lib = new ArrayList<Book>();
		lib.add(new Book("태백산맥","조정래"));
		lib.add(new Book("데비안","헤르만 헤세"));
		lib.add(new Book("어떻게 살 것인가?","유시민"));
		lib.add(new Book("토지","박경리"));
		lib.add(new Book("부자되는방법","임한결"));
		
		for(int i=0; i<lib.size(); i++ ) {
			Book book = lib.get(i);
			book.showBookInfo();
		}
		
		System.out.println();
		
		for(Book book : lib) {
			book.showBookInfo();
		}

	}

}
