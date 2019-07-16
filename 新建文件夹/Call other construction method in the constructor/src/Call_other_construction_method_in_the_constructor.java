class Student{
	private String name = null;
	private int age = 0;
	public Student() {
		this("---",0);
	}
	public Student(String name) {
		this(name,0);
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showNameAndAge() {
		System.out.println(name);
		System.out.println(age);
	}
}
public class Call_other_construction_method_in_the_constructor {
	public static void main(String[] argv) {
		Student stu = new Student("john",21);
		stu.showNameAndAge();
	}
}
