package reference;

public class quiz1 {

	public static void main(String[] args) {

		Book book1 = new Book("삼국지", 50000, "누리출판사", 999);
		Book book2 = new Book("구구단", 30000, "별곰출판사", 99);
		Book book3 = new Book("논어", 20000, "별곰출판사", 333);
		
		Member member = new Member(55, "둘리", book1, book2, book3);

	}

}

class Member {
	int userNo;
	String name;
	Book book1;
	Book book2;
	Book book3;
	public Member(int userNo, String name, Book book1, Book book2, Book book3) {
		super();
		this.userNo = userNo;
		this.name = name;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}

}

class Book {
	String title;
	int price;
	String 출판사;
	int page;

	public Book(String title, int price, String 출판사, int page) {
		super();
		this.title = title;
		this.price = price;
		this.출판사 = 출판사;
		this.page = page;
	}

}