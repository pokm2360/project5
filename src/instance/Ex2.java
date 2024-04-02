package instance;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student2 = new Student();
		
		student2.studentID = 1002;
		student2.studentName = "또치";
		student2.grade = 3;
		student2.address = "서울";
		
		student2.showStudentInfo();
		
		System.out.println("객체의 주소는" + student2 + " 입니다.");
				
	}
}
