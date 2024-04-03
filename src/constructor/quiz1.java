package constructor;

public class quiz1 {

	public static void main(String[] args) {

		Book book = new Book();
		book.title = "스프링부트";
		book.price = 30000;
		book.출판사 = "한빛출판사";
		book.page = 500;
		
		Book book2 = new Book();
		book.title = "자바프로그래밍";
		book.price = 10000;
		book.출판사 = "한빛출판사";
		book.page = 500;
	}

}

class Book {
	
	String title;
	int price;
	String 출판사;
	int page;
	
//		매개변수가 없는 디폴트 생성자
	public Book() {
	}
//		매개변수가 있는 생성자
	public Book(String title, int price, String 출판사, int page) {
		super();
		this.title = title;
		this.price = price;
		this.출판사 = 출판사;
		this.page = page;
	}

}