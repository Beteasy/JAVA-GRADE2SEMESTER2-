package circle;

public class circle {
	private int x;
	private int y;
	private double radius;
	public double PI = 3.14;
	public double getArea() {
		return PI * radius *radius;
	}
	public static void main(String[] argv) {
		circle circle1 = new circle();
		circle1.x = 3;
		circle1.y = 6;
		circle1.radius = 2;
		System.out.println(circle1.x);
		System.out.println(circle1.y);
		System.out.println(circle1.getArea());
	}
	

}
