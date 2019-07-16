package shiyan2;

public class Student implements Comparable<Student>{

	String name;
	int height;
	
	//���췽��
	Student(String name, int height){
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	//��д���򷽷�
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.height-o.height;
	}
	
}
