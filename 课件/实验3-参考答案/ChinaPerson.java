package �������������.ʵ��3;

public class ChinaPerson extends Person {
	
	public ChinaPerson() {
		super();
	}

	public ChinaPerson(double weight, double height) {
		super(weight, height);
	}

	public void speakHello() {    
		System.out.println("����");
	} 
	
	public double averageHeight(ChinaPerson[] people) {
		return super.averageHeight(people);
	}
         
	public double averageWeight(ChinaPerson[] people){
		return super.averageWeight(people);	
	}

	public void chinaGongfu() {
		System.out.println("������,վ����,˯�繭");
	}
}
