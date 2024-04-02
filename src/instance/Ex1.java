package instance;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Student student = new Student();
			
			student.studentID = 1001;
			student.studentName = "둘리";
			student.grade = 2;
			student.address = "인천 남동구";
			
			System.out.println("studentID = " + student.studentID);
			System.out.println("studentName =" + student.studentName);
			System.out.println("grade =" + student.grade);
			System.out.println("address =" + student.address);
			
			student.showStudentInfo();
			System.out.println("객체의 주소는 " + student + " 입니다.");
	}

}
