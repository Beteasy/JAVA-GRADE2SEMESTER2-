package shiyan3;

public class ChinaPerson extends Person{
	
	public ChinaPerson(double h, double w) {
		super(h,w);
	}
	
	//重写speakHell()
	public void speakHell() {
		System.out.println("您好");
	}
	
	//重写averageHeight
	public double averageHeight(Person[] people) {		//计算people的平均身高
		double average = 0.0;
		double sum = 0.0;
		for(int i=0; i<people.length; i++) {
			sum += people[i].height;
		}
		average = sum / (double)people.length / 100;
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
	
	public void chinaGongfu() {
		System.out.println("坐如钟,站如松,睡如弓");
	}
}
