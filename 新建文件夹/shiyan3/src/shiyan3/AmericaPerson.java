package shiyan3;

public class AmericaPerson extends Person{
	
	public AmericaPerson(double h, double w) {
		super(h,w);
	}
	
	//重写speakHell()
	public void speakHell() {
		System.out.println("How do you do?");
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
		
	public void americaBoxing() {
		System.out.println("直拳、钩拳、组合拳");
	}
}
