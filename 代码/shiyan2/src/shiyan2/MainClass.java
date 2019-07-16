package shiyan2;

import java.io.*;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Student.txt");
		SearchWindow win = new SearchWindow();
		
		Student[] stu = new Student[] {
				new Student("����",198),
				new Student("����",188),
				new Student("����",178)
		};
		

		//��Student������ӵ�������
		LinkedList<Student> list = new LinkedList<Student>();
		for(int i=0; i<stu.length; i++) {
			list.add(stu[i]);
		}
		
		//�������еĶ���heightֵ����
		Collections.sort(list);
		
		//����student����ĵ�����
		Iterator<Student> iter = list.iterator();
		
		try {
			FileWriter writer = new FileWriter(file);
			BufferedWriter bwriter = new BufferedWriter(writer);
			
			bwriter.append("����\t���");
			bwriter.newLine();
			
			while(iter.hasNext()) {
				Student temp = iter.next();
				String tname = temp.name;
				int theight = temp.height;
				bwriter.append(tname+"\t"+theight);
				bwriter.newLine();
			}
			
			//�رջ�����
			bwriter.close();
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}

	}

}
