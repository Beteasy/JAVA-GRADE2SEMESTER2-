package shiyan3;

public class Person {
	
	protected double height;
	protected double weight;
	
	//���췽��
	public Person(double height, double weight){
		this.height = height;
		this.weight = weight;
	}
	
	public void speakHell() {
		
	}
	
	public double averageHeight(Person[] people) {		//����people��ƽ�����
		double average = 0.0;
		double sum = 0.0;
		for(int i=0; i<people.length; i++) {
			sum += people[i].height;
		}
		average = sum / (double)people.length;
		return average;
	}
	
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
