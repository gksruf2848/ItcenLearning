package Itcen_17_ex;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {};
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void setBookName(String bookName) { this.bookName = bookName; }
	public String getBookName() { return bookName; }
	public void setAuthor(String author) { this.author = author; }
	public String getAuthor() { return author; }
	
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}
}
