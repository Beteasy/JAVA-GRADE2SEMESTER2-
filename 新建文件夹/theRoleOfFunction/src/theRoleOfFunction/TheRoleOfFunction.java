package theRoleOfFunction;

public class TheRoleOfFunction {
	public static void main(String args[]) {
		int result = power5(5)+power5(4)+power5(3);
		System.out.println(result);
	}
	
	public static int power5(int n) {
		return n*n*n*n*n;
	}

}
