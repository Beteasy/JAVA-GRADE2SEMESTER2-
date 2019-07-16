package mypackage;

public class Compute {
	double a, b;
	
	public Compute(double a,double b) {
		this.a = a;
		this.b = b;
	}
	public double sum() {
		return a+b;
	}
	
	public double sub() {
		return a-b;
	}
	
	public double multi() {
		return a*b;
	}
	
	public double div(){
		return a/b;
	}
}
