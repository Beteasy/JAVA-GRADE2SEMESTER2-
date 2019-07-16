package shiyan4;

public class Circle extends Geometry {
	double radius;
	
	//构造方法
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//计算面积
	public double getArea() {
		return 3.14*radius*radius;
	}
}
