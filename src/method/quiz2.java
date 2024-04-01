package method;

public class quiz2 {

	public static int good(int no1, int no2) {
		
		if (no1 > no2) {
			return no1;
		} else if (no1 == no2) {
			return no1;
		} else {
			return no2;
		}
	}
	
	public static void main(String[] args) {

		good(5, 5);
		
}

}