package shiyan4;

public class Circle extends Geometry {
	double radius;
	
	//���췽��
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//�������
	public double getArea() {
		return 3.14*radius*radius;
	}
}
