package example12_2;

import java.io.*;

public class Example12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("E:\\ѧУ�ļ�\\Java\\�½��ļ���\\Example12_2\\src\\example12_2");
		FileAccept fileAccept = new FileAccept();
		fileAccept.setExtendName("java");
		String fileName[] = dir.list(fileAccept);
		for(String name:fileName) {
			System.out.println(name);
		}
	}

}
