package reference;

public class quiz2 {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("둘리", 40, 5000000, 10);
		Employee employee2 = new Employee("또치", 30, 3000000, 3);
		Employee employee3 = new Employee("도우너", 50, 6000000, 13);
		
		Department department = new Department(employee1, employee2, employee3);
		
	}

}

class Department {
	Employee 부서장;
	Employee 수석연구원;
	Employee 책임연구원;
	
	public Department(Employee employee1, Employee employee2, Employee employee3) {
		super();
		this.부서장 = employee1;
		this.수석연구원 = employee2;
		this.책임연구원 = employee3;
	}
	
}

class Employee {
	String name;
	int age;
	int money;
	int workyear;
	
	public Employee(String name, int age, int money, int workyear) {
		super();
		this.name = name;
		this.age = age;
		this.money = money;
		this.workyear = workyear;
	}
	
	
}