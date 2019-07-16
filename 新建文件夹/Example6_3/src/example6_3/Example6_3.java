package example6_3;

public class Example6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cubic cu = new Cubic() {
			public double getCubic(double x) {
				return x*x*x;
			}
		};
		
		double m = cu.getCubic(5);	//回调接口		
		
		System.out.println("m="+m);
		
		A a = new A();
		a.f(new Cubic() {
			public double getCubic(double x) {
				return x*x*x;
			}
		});
	}

}