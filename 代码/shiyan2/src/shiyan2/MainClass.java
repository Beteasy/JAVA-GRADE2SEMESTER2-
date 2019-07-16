package shiyan2;

import java.io.*;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Student.txt");
		SearchWindow win = new SearchWindow();
		
		Student[] stu = new Student[] {
				new Student("周五",198),
				new Student("李四",188),
				new Student("张三",178)
		};
		

		//将Student对象添加到链表中
		LinkedList<Student> list = new LinkedList<Student>();
		for(int i=0; i<stu.length; i++) {
			list.add(stu[i]);
		}
		
		//将链表中的对象按height值排序
		Collections.sort(list);
		
		//创建student对象的迭代器
		Iterator<Student> iter = list.iterator();
		
		try {
			FileWriter writer = new FileWriter(file);
			BufferedWriter bwriter = new BufferedWriter(writer);
			
			bwriter.append("姓名\t身高");
			bwriter.newLine();
			
			while(iter.hasNext()) {
				Student temp = iter.next();
				String tname = temp.name;
				int theight = temp.height;
				bwriter.append(tname+"\t"+theight);
				bwriter.newLine();
			}
			
			//关闭缓冲流
			bwriter.close();
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}

	}

}
