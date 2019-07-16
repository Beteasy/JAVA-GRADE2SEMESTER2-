package toString_valueOf;

public class ToString_valueOf {
	
	public static void main(String[] argv) {
		class student{
			int score;
			String name;
		}
		student stu = new student();
		stu.name = "john";
		stu.score = 100;
		System.out.println(String.valueOf(stu.score));
		System.out.println(stu.name.toString());
		
	}

}
