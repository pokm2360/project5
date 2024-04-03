package constructor;

public class quiz2 {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.com = "현대";
		car.model = "쏘나타";
		car.color = "흰색";
		car.speed = 200;
		
		Car car2 = new Car("기아", "레이", "검정색", 150);
		
	}

}

class Car {
	String com;
	String model;
	String color;
	int speed;

	public Car() {
		super();
	}

	public Car(String com, String model, String color, int speed) {
		super();
		this.com = com;
		this.model = model;
		this.color = color;
		this.speed = speed;
	}

}