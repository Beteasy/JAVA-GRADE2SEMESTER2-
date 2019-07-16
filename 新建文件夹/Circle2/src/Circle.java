
public class Circle {
	public int a = 10;
	public int b = a;
	public static void main(String[] argv) {
		Circle circle1 = new Circle();
		circle1.a = 20;
		System.out.println(circle1.a);
		System.out.println(circle1.b);
	}

}
