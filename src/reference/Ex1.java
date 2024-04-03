package reference;

public class Ex1 {

	public static void main(String[] args) {
		
		Subject math = new Subject("수학", 85);
		
		Subject korean = new Subject("국어", 100);
		
		Student student = new Student(1001, "둘리", math, korean);
	}

}

class Subject {
	
	String subjectName;
	
	int scorePoint;

//	모든 멤버를 초기화하는 생성자 만들기
	public Subject(String subjectName, int scorePoint) {
		super();
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}

}

class Student {
	
	int studentID;
	
	String studentName;
	
	Subject math;
	
	Subject korean;

//	생성자
	public Student(int studentID, String studentName, Subject math, Subject korean) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.math = math;
		this.korean = korean;
	}
	
	
}