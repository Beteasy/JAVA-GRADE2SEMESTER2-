package 面向对象程序设计.实验3;

public class Person {	
	protected double weight;
	protected double height;
	
	public Person() {
		super();
	}
	
	public Person(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	
	public void speakHello() {
		System.out.println("yayayaya");
	}  

	public double averageHeight(Person[] people) {
		double totalHeight=0.0;
		double avgHeight=0.0;		
		for(int i=0; i<people.length; i++) {
			totalHeight += people[i].height;			
		}
		
		avgHeight = totalHeight/people.length;		
				
		return avgHeight;
	}

	public double averageWeight(Person[] people) {
		double totalWeight=0.0;		
		for(int i=0; i<people.length; i++) {
			totalWeight += people[i].weight;			
		}		
		
		double avgWeight=totalWeight/people.length;
				
		return avgWeight;
	}
}
