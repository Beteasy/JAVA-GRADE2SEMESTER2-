package example12_ppt2;

import java.io.*;

public class Example12_ppt2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Student s1 = new Student(1,"Mar", 20, "Computer_Science");
		Student s3 = new Student(2,"Cathy", 21, "Software_Engineering");
		try {
			FileOutputStream fos = new FileOutputStream("Student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.writeObject(s3);
			
			FileInputStream fis = new FileInputStream("Student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s2,s4;
			s2 = (Student)ois.readObject();
			s4 = (Student)ois.readObject();
			
			System.out.println(s2.id+" "+s2.name+" "+s2.age+" "+s2.department);
			System.out.println(s4.id+" "+s4.name+" "+s4.age+" "+s4.department);
			oos.close();
			ois.close();
		}
		catch(IOException e) {}
		catch(ClassNotFoundException e) {}
	}
}
