package method;

public class quiz3 {

	public static int plus(int n1, int n2) {
		int sum = 0;
		for (int i = n1; i <=n2; i++) {
			sum = sum + i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(plus(5,10));

		
}

}