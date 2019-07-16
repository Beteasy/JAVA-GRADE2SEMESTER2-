package squareSum;

public class SquareSum {
	public static void main(String args[]) {
		int sum = getSquareSum(2,3);
		System.out.println(sum);
	}
	
	public static int getSquareSum(int a, int b) {
		return a*a+b*b;
	}

}
