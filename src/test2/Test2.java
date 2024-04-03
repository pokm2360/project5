package test2;

public class Test2 {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.name = "둘리";
		
		person.height = 170;
	}

}

class Person {
	public String name;
	int height;
	private double weight; // 접근범위 좁음, 클래스 안에서만 사용가능
	
	public void showInfo() {
			System.out.println("이름: " + name + "키: " + height + "몸무게: " + weight);
	}
}