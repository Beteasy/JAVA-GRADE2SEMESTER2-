package ch10_10_15;

public class Triangle {
	
	double sideA, sideB, sideC, area;
	boolean isTriangle;
	
	public String getArea() {
		is();
		if(isTriangle) {
			double p = (sideA+sideB+sideC)/2.0;
			area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
			return String.valueOf(area);
		}
		else {
			return "�޷��������";
		}
	}
	
	public void setA(double a) {
		sideA = a;
		
		//�Ƿ���Ե�����ȡ������װ
//		if(sideA+sideB>sideC && sideA+sideC>sideB && sideB+sideC>sideA) {
//			isTriangle = true;
//		}
//		else {
//			isTriangle = false;
//		}
	}
	
	public void setB(double b) {
		sideB = b;
//		if(sideA+sideB>sideC && sideA+sideC>sideB && sideB+sideC>sideA) {
//			isTriangle = true;
//		}
//		else {
//			isTriangle = false;
//		}
	}
	
	public void setC(double c) {
		sideC = c;
//		if(sideA+sideB>sideC && sideA+sideC>sideB && sideB+sideC>sideA) {
//			isTriangle = true;
//		}
//		else {
//			isTriangle = false;
//		}
	}
	
	//������װ
	void is() {
		if(sideA+sideB>sideC && sideA+sideC>sideB && sideB+sideC>sideA) {
			isTriangle = true;
		}
		else {
			isTriangle = false;
		}
	}
}
