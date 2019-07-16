package 实验4;

//长方形
public class Rect extends Geometry {
	double a,b;	//长和款
	
    Rect(double a,double b) {
        this.a = a; 
        this.b = b; 
    }

	@Override
	public double getArea() {		
		return a*b;
	}

}
