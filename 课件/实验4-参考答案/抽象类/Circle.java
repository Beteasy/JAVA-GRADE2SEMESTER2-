package ÊµÑé4;

//Ô²ÐÎ
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
