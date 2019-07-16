package 面向对象程序设计.实验3;

import org.omg.CORBA.PUBLIC_MEMBER;

public class AmericaPerson extends Person {

	public AmericaPerson() {}

	public AmericaPerson(double weight, double height) {
		super(weight, height);		
	}	
	   
	public void speakHello(){
		System.out.println("How do you do?");
	}
	
	public double averageHeight(AmericaPerson[] people){
		double avgHeight=super.averageHeight(people);
		System.out.println("American's average height:"+avgHeight*100+" cm");
		
		return avgHeight;
	}
	   
	public double averageWeight(AmericaPerson[] people) { 
	     double avgWeight = super.averageWeight(people);  
	     System.out.println("American's average weight:"+avgWeight+" kg"); 
	     
	     return avgWeight;
	}
	
	public void americanBoxing() {
	     System.out.println("直拳、钩拳、组合拳");
	}
}
