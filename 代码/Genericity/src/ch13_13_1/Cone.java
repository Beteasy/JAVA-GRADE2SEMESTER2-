package ch13_13_1;

public class Cone<E> {

	double height;
	E bottom;
	
	public Cone(E b){
		bottom =  b;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	public double computeVolume() {
		String s = bottom.toString();	//泛型变量只能调用从Object类继承的或重写的方法
		double area = Double.parseDouble(s);
		return 1.0/3.0*area*height;
	}
}
