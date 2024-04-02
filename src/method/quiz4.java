package method;

public class quiz4 {

	public static int min(int n1, int n2) {
		int minus = (n1 - n2);
		if (n1 < n2) {
			return -999;
		} else {
			return minus;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(min(20,5));
	
}

}