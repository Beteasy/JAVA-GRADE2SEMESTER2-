package example12_1;
import java.io.*;
public class Example12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("Example12_1.java");
		File f2 = new File("D:\\chapter11");
		System.out.println(f1.getName()+"�ǿɶ�����"+f1.canRead());
		System.out.println(f1.getName()+"�ĳ���:"+f1.length());
		System.out.println(f1.getName()+"�ľ���·��:"+f1.getAbsolutePath());
		System.out.println(f2.getName()+"��Ŀ¼��?"+f2.isDirectory());
	}

}
