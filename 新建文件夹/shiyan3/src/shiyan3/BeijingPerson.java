package shiyan3;

public class BeijingPerson extends ChinaPerson{
	
	public BeijingPerson(double h, double w) {
		super(h,w);
	}
	
	public void beijingOoera() {
		System.out.println("���������¡�����������");
	}
	
	//��дaverageHeight
	public double averageHeight(Person[] people) {		//����people��ƽ�����
		double average = 0.0;
		double sum = 0.0;
		for(int i=0; i<people.length; i++) {
			sum += people[i].height;
		}
		average = sum / (double)people.length;
		return average;
	}
	
	//��дaverageWeight
	public double averageWeight(Person[] people) {		//����people��ƽ������
		double average = 0.0;
		double sum = 0.0;
		for(int i=0; i<people.length; i++) {
			sum += people[i].weight;
		}
		average = sum / (double)people.length;
		return average;
	}
}
