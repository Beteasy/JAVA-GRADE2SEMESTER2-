package shiyan2;

public class Student implements Comparable<Student>{

	String name;
	int height;
	
	//构造方法
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
	
	//重写排序方法
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.height-o.height;
	}
	
}
