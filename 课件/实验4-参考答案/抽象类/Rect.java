package ʵ��4;

//������
public class Rect extends Geometry {
	double a,b;	//���Ϳ�
	
    Rect(double a,double b) {
        this.a = a; 
        this.b = b; 
    }

	@Override
	public double getArea() {		
		return a*b;
	}

}
