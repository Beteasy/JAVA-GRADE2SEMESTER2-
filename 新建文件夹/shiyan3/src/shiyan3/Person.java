package shiyan3;

public class Person {
	
	protected double height;
	protected double weight;
	
	//构造方法
	public Person(double height, double weight){
		this.height = height;
		this.weight = weight;
	}
	
	public void speakHell() {
		
	}
	
	public double averageHeight(Person[] people) {		//计算people的平均身高
		double average = 0.0;
		double sum = 0.0;
		for(int i=0; i<people.length; i++) {
			sum += people[i].height;
		}
		average = sum / (double)people.length;
		return average;
	}
	
	public double averageWeight(Person[] people) {		//计算people的平均重量
		double average = 0.0;
		double sum = 0.0;
		for(int i=0; i<people.length; i++) {
			sum += people[i].weight;
		}
		average = sum / (double)people.length;
		return average;
	}
}
