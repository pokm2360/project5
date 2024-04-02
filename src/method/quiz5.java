package method;

public class quiz5 {

//	return = 반환값을 내보낼때 / 함수를 종료할때 사용
	
	public static void div(int n1, int n2) {
		
		if (n2 == 0) {
			System.out.println("나누는 수는 0이 될수 없습니다");
			return;
		} 
		
		int result = n1 / n2;
		
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		
	div(10,2);
		
}

}