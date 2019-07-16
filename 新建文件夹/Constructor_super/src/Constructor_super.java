class primary{
	private String name = null;
	
	public primary(){
		name = "---";
		System.out.println("construct a primary object without parameter ");
	}
	
	public primary(String name) {
		this.name = name;
		System.out.println("construct a primary object with a parameter ");
	}
	
	public void showName() {
		if(name == "---") {
			System.out.println("this student has no information");
		}
		else {
			System.out.println(name);
		}
		return;
	}
	
	public void goSchool() {
		System.out.println("i will go to school");
	}
}

class HighSchool extends primary{
	public HighSchool(){
		System.out.println("construct a HighSchool object without parameter ");
	}
	
	public HighSchool(String name){
		super(name);
		System.out.println("construct a HighSchool object with a parameter ");
	}
	
	public void goToLaboratory() {
		System.out.println("i will go to laboratory");
	}
}

class Undergraduate extends HighSchool{
	public Undergraduate() {
		System.out.println("construct a HighSchool object without parameter ");
	}
	public Undergraduate(String name) {
		super(name);
		System.out.println("construct a Undergraduate object with a parameter ");
	}
	
	public void goToLectureHall() {
		System.out.println("i will go to the lecture hall");
		super.goToLaboratory();
		return;
	}
}
public class Constructor_super {
	public static void main(String[] argv) {
		System.out.println("--------------------------");
		Undergraduate stu1 = new Undergraduate();
		System.out.println("---------------------------");
		Undergraduate Mark = new Undergraduate("Mark zuckerberg");
		
		System.out.println("---------------------------");
		HighSchool stu2 = new HighSchool();
		System.out.println("---------------------------");
		HighSchool Sergey = new HighSchool("Sergey Brin");
		
		System.out.println("---------------------------");
		primary Larry = new primary("Larry Page");
		
		stu1.showName();
		Sergey.showName();
		
		Sergey.goSchool();
		
		Mark.goSchool();
		Mark.goToLectureHall();
	}
}
