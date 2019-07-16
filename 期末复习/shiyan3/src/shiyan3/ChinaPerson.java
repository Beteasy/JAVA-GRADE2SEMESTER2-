package shiyan3;

public class ChinaPerson extends Person{
	
	public ChinaPerson() {
		super();
	}
	
	public ChinaPerson(double height, double weight) {
		super(height,weight);
	}
	
	public void speakHell() {
		System.out.println("ÄúºÃ");
	}
	
	public double averageHeight(ChinaPerson[] people) {
		double sum=0.0;
		for(int i=0; i<people.length; i++) {
			sum +=people[i].height;
		}
		return sum/people.length;
	}
	
	public double averageWeight(ChinaPerson[] people) {
		double sum=0.0;
		for(int i=0; i<people.length; i++) {
			sum += people[i].weight;
		}
		return sum/people.length;
	}
	
	public void chinaGongfu() {
		System.out.println("×øÈçÖÓ,Õ¾ÈçËÉ,Ë¯Èç¹­");
	}
}
