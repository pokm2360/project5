package hiding;

public class Ex1 {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		date.month = 2;
		
		date.day = 31;
		System.out.println("현재 날짜는 " + date.month + "월 " + date.day + "일");
}

}

class MyDate {
	public int month;
	public int day;
}