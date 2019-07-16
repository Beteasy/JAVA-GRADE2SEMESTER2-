package shiyan3;

public class BeijingPerson extends ChinaPerson{
	
	public BeijingPerson(double h, double w) {
		super(h,w);
	}
	
	public void beijingOoera() {
		System.out.println("花脸、青衣、花旦和老生");
	}
	
	//重写averageHeight
	public double averageHeight(Person[] people) {		//计算people的平均身高
		double average = 0.0;
		double sum = 0.0;
		for(int i=0; i<people.length; i++) {
			sum += people[i].height;
		}
		average = sum / (double)people.length;
		return average;
	}
	
	//重写averageWeight
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
