package ʵ��4;

public class TotalArea {
	Geometry[] tuxing;
	double totalArea=0;
	
	public TotalArea(Geometry[] tuxing) {
		super();
		this.tuxing = tuxing;
	}
	   
	public void setTuxing(Geometry[] t) {
	    tuxing=t;
	}
	   
	public double computeTotalArea() {
		//��ѭ�������tuxing��Ԫ�ص���getArea�������������ص�ֵ�ۼӵ�totalArea
		for(int i=0; i<tuxing.length; i++){
			totalArea = totalArea+tuxing[i].getArea();
		}
		   
		return totalArea;
	}    
}
