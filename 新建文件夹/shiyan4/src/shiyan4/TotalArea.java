package shiyan4;

public class TotalArea {
	
	double totalArea = 0;
	Geometry[] tuxing;
	
	public TotalArea(Geometry[] tuxing) {
		//tuxing(Geometry��������)�����ڼ������ͼ�ε����֮��
		this.tuxing = tuxing;
	}

	//�÷����������tuxing������Ԫ�ص���getArea()��������õ����֮�ͣ���������ĺͷ���
	public double computeTotalArea() {
		for(int i=0; i<tuxing.length; i++) {
				totalArea += tuxing[i].getArea();
		}
		return totalArea;
	}
}
