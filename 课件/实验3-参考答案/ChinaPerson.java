package 面向对象程序设计.实验3;

public class ChinaPerson extends Person {
	
	public ChinaPerson() {
		super();
	}

	public ChinaPerson(double weight, double height) {
		super(weight, height);
	}

	public void speakHello() {    
		System.out.println("您好");
	} 
	
	public double averageHeight(ChinaPerson[] people) {
		return super.averageHeight(people);
	}
         
	public double averageWeight(ChinaPerson[] people){
		return super.averageWeight(people);	
	}

	public void chinaGongfu() {
		System.out.println("坐如钟,站如松,睡如弓");
	}
}
