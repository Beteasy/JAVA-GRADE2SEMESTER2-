package shiyan3;

public class AmericaPerson extends Person{
	
	public AmericaPerson(double h, double w) {
		super(h,w);
	}
	
	//��дspeakHell()
	public void speakHell() {
		System.out.println("How do you do?");
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
		
	public void americaBoxing() {
		System.out.println("ֱȭ����ȭ�����ȭ");
	}
}
