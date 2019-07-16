class Student{
	public String name = "null";
	
	public Student() {
		this.name = "null";
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(char name[])
	{
		//this.name = name.toString();
		this.name = new String(name);	//i don't understand this
	}
	
	public Student(Student stu) {
		this.name = stu.name;
	}
	
	public void showName() {
		if(name == "null")
		{
			System.out.println("the student has no imformation!");
		}
		else
		{
			System.out.println(name);
		}
	}
}
public class ConstructorRload {
	public static void main(String[] argv)
	{
		char name[] = {'j','o','h','n'};
		Student stu1 = new Student("john");
		Student stu2 = new Student(name);
		Student stu3 = new Student();
		Student stu4 = new Student(stu1);
		
		stu1.showName();
		stu2.showName();
		stu3.showName();
		stu4.showName();
	}
}