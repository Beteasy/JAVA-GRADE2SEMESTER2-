package ʵ��4;

//Բ��
public class Circle extends Geometry {	
	double r;
	
    Circle(double r) {
        this.r = r;
    }

	@Override
	public double getArea() {		
		return 3.14*r*r;
	}

}
