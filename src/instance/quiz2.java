package instance;

public class quiz2 {
	public static void main(String[] args) {
		Order order = new Order();

		order.orderNo = 1111;
		order.orderDate = "2018년 3월 12일";
		order.customerName = "둘리";
		order.address = "서울시 영등포구 여의도동 20번지";

		order.showOrderInfo();
	}
}

class Order {
	int orderNo; // 주문번호
	String orderDate; // 주문일자. 날짜는 Date 클래스를 많이 사용하지만, 여기서는 일단 String으로
	String customerName;// 주문자이름
	String address; // 배송지

	public void showOrderInfo() {
		System.out.println("주문번호:" + orderNo + ", 주문날짜:" + orderDate + ", 주문자이름: " + customerName + ", 배송지:" + address);
	}

}
