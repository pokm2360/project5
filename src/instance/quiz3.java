package instance;


public class quiz3 {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "자바프로그래밍";
		book1.price = 18000;
		book1.출판사 = "한빛";
		book1.pageNo = 300;
		book1.showInfo();
		System.out.println("인스턴스 주소 :" + book1);
		System.out.println();
		
		Book book2 = new Book();
		book2.title = "스프링";
		book2.price = 15000;
		book2.출판사 = "한빛";
		book2.pageNo = 500;
		book2.showInfo();
		System.out.println("인스턴스 주소 :" + book2);
	}

}
class Book {
	String title;
	int price;
	String 출판사;
	int pageNo;
	
	public void showInfo() {
		System.out.println("제목: " + title + " 가격:" + price + ", 출판사:" + 출판사 + ", 페이지수:" + pageNo);
	}
	
}
