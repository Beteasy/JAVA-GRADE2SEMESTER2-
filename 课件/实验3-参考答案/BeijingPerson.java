package �������������.ʵ��3;

public class BeijingPerson extends ChinaPerson {
	public BeijingPerson() {
	}

	public BeijingPerson(double weight, double height) {
		super(weight, height);
	}
	
	public void beijingOpera() { 
		System.out.println("���������¡�����������");
	}
	   
	public double averageHeight(BeijingPerson[] people) {		
		return super.averageHeight(people);
	}
		 
	public double averageWeight(BeijingPerson[] people) {				 
		return super.averageWeight(people);
	}
}
