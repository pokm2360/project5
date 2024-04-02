package method;

public class quiz7 {
		
	public static void hap(int n1) {
//		int hun = n1 / 100;
//		int ten = (n1 / 10) / 10;
//		int one = (n1 / 100) % 10;
//		int result = hun + ten + one;
//		
//		System.out.println(result);
		
		int sum = 0;
		sum = sum + (n1%10);
		
		n1 = n1/10;
		sum = sum + (n1%10);
		
		n1 = n1/10;
		sum = sum + n1;
		
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
	hap(932);
}

}