package ʵ��_Java�߼����.ʵ��2;

public class Student implements Comparable<Student> { 
	int height=0;
	String name;
	   
	Student(String n,int h) {
		name=n;
		height = h;	     
	}

	public int compareTo(Student b) { // ����Student������ȵ��ҽ������ߵ�heightֵ���
		return (this.height-b.height);
	}
}



