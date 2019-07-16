package shiyan3;

public class Person {
	protected double height, weight;
	
	public Person() {}
	
	public Person(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public void speakHell() {}
	
	public double averageHeight(Person[] people) {
		double sum=0.0;
		for(int i=0; i<people.length; i++) {
			sum +=people[i].height;
		}
		return sum/people.length;
	}
	
	public double averageWeight(Person[] people) {
		double sum=0.0;
		for(int i=0; i<people.length; i++) {
			sum += people[i].weight;
		}
		return sum/people.length;
	}
}
