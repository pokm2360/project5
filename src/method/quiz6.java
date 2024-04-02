package method;

public class quiz6 {
		
//	public static void cal(int n1, int n2, char n3) {
//		int sum = n1 + n2;
//		int min = n1 - n2;
//		int mul = n1 * n2;
//		int div = n1 / n2;
//		
//		if (n3 == '+') {
//			System.out.println(sum);
//		} else if (n3 == '-') {
//			System.out.println(min);
//		} else if (n3 == '*') {
//			System.out.println(mul);
//		} else if (n3 == '/') {
//			System.out.println(div);
//		}
//	}
	
	public static void cal(int n1, int n2, char oper) {
		int result = 0;
		switch (oper) {
		case '+' :
			result = n1 + n2;
			System.out.println(n1 + "+" + n2 + "=" + result);
			break;
		case '-' :
			result = n1 - n2;
			System.out.println(n1 + "-" + n2 + "=" + result);
			break;
		case '*' :
			result = n1 * n2;
			System.out.println(n1 + "*" + n2 + "=" + result);
			break;
		case '/' :
			result = n1 / n2;
			System.out.println(n1 + "/" + n2 + "=" + result);
			break;
		}
	}
	
	public static void main(String[] args) {
		
	cal (4,4,'*');
		
}

}