
public class Example6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People wang = new People();
		People zhang = new People();
		try {
			wang.setAge(180);
			System.out.println(wang.getAge());
		}
		catch(IntegerException e) {
			System.out.println(e.toString());
		}
		try {
			zhang.setAge(37);
			System.out.println(zhang.getAge());
		}
		 catch(IntegerException e) {
			 System.out.println(e.toString());
		 }
	}

}
