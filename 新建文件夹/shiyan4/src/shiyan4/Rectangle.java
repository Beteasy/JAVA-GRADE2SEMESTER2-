package shiyan4;

public class Rectangle extends Geometry{
	double height;
	double width;
	
	//构造方法
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	//计算面积
	public double getArea() {
		return height*width;
	}
}
