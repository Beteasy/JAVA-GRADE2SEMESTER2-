package shiyan4;

public class Rectangle extends Geometry{
	double height;
	double width;
	
	//���췽��
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	//�������
	public double getArea() {
		return height*width;
	}
}
