package functionReloade;

public class FunctionReloade {
	public static void main(String args[]) {
		System.out.println(getSquareSum(2,3));
		System.out.println(getSquareSum(2L,3L));
		System.out.println(getSquareSum(2F,3F));
		System.out.println(getSquareSum(2.0,3.0));
	}
	
	public static int getSquareSum(int a, int b) {
		return a*a+b*b;
	}
	
	public static long getSquareSum(long a, long b) {
		return a*a+b*b;
	}
	
	public static float getSquareSum(float a, float b) {
		return a*a+b*b;
	}
	
	public static double getSquareSum(double a, double b) {
		return a*a+b*b;
	}

}
