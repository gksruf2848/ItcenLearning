package Itcen_17_ex;

public class BookArray {

	public static void main(String[] args) {
		Book[] lib = new Book[5];
		
		lib[0] = new Book("태백산맥", "조정래");
		lib[1] = new Book("데미안", "헤르만 헤세");
		lib[2] = new Book("어떻게 살 것인가?", "유시민");
		lib[3] = new Book("토지", "박경리");
		lib[4] = new Book("어린왕자", "생텍지페리");
		
		for(int i=0; i<lib.length; i++) {
			lib[i].showBookInfo();
		}
		
		for(int i=0; i<lib.length; i++) {
			System.out.println(lib[i]);
		}

	}

}
