package instance;
/* 다음과 같이 사람클래스(Person)를 정의하세요.
 * 이름, 나이, 결혼여부, 자식수를 속성으로 갖습니다.
 *    
 * 그리고 Person 클래스를 사용하여 다음 정보를 가지는 인스턴스를 생성하세요.
 * 이름: James
 * 나이: 40세
 * 결혼여부: o
 * 자식: 3
 * */
public class quiz1 {

	public void main(String[] args) {
		Person person = new Person();
		person.personName = "James";
		person.personAge = 40;
		person.isMarried = true;
		person.son = 3;
		
		System.out.println("이름 :" + person.personName);
		System.out.println("나이 :" + person.personAge);
		System.out.println("결혼 여부 :" + person.isMarried);
		System.out.println("자녀 수 :" + person.son);
		}
		
	class Person {
		String personName;
		int personAge;
		boolean isMarried;
		int son;
		
	}

}
