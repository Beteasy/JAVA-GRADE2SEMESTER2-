package shiyan4;

public class TotalArea {
	
	double totalArea = 0;
	Geometry[] tuxing;
	
	public TotalArea(Geometry[] tuxing) {
		//tuxing(Geometry对象数组)，用于计算各种图形的面积之和
		this.tuxing = tuxing;
	}

	//该方法计算变量tuxing的所有元素调用getArea()方法所获得的面积之和，并将计算的和返回
	public double computeTotalArea() {
		for(int i=0; i<tuxing.length; i++) {
				totalArea += tuxing[i].getArea();
		}
		return totalArea;
	}
}
