package ch13_13_1;

public class Circle {

	double area, radius;
	
	Circle(double r){
		radius = r;
	}
	
	public String toString() {
		area = Math.PI*radius*radius;
		return ""+area;
	}
}
