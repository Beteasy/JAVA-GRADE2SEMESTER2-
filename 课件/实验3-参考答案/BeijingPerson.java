package 面向对象程序设计.实验3;

public class BeijingPerson extends ChinaPerson {
	public BeijingPerson() {
	}

	public BeijingPerson(double weight, double height) {
		super(weight, height);
	}
	
	public void beijingOpera() { 
		System.out.println("花脸、青衣、花旦和老生");
	}
	   
	public double averageHeight(BeijingPerson[] people) {		
		return super.averageHeight(people);
	}
		 
	public double averageWeight(BeijingPerson[] people) {				 
		return super.averageWeight(people);
	}
}
