package ʵ��_Java�߼����.ʵ��2;

import java.util.*;

public class FindStudent {
	
	public static void main(String args[ ]) { 
		List<Student> list = new LinkedList<Student>();
		list.add(new Student("����",188));
		list.add(new Student("����",178));
		list.add(new Student("����",198)); 
		
		Iterator<Student> iter=list.iterator();
		System.out.println("����ǰ,�����е�����");
		while(iter.hasNext()){
			Student stu=iter.next();
			System.out.println(stu.name+ "���:"+stu.height);
		}
		Collections.sort(list);
		
		System.out.println("�����,�����е�����");
		iter=list.iterator();
		while(iter.hasNext()){
			Student stu=iter.next();
			System.out.println(stu.name+ "���:"+stu.height);
		}
		
		Student zhaoLin = new Student("zhao xiao lin",178);
		int index = Collections.binarySearch(list,zhaoLin,null);
		if(index>=0) {
			System.out.println(zhaoLin.name+"��������"+list.get(index).name+"�����ͬ");
		}
	}
}