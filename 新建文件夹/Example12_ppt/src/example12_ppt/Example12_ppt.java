package example12_ppt;

import java.io.*;

public class Example12_ppt{
	public static void main(String args[ ]) {	
		byte buffer[] = new byte[128];
		System.out.println("���������ݣ��س��󱣴浽�ļ�test.txt");
		System.out.println("����#���˳�");
		
		try {
			FileOutputStream f = new FileOutputStream("test.txt");
			while(true) {
				int n = System.in.read(buffer);
				if(buffer[0]=='#') break;	//#֮ǰ���ַ������˳�
				f.write(buffer,0,n);
				f.write('\n');
			}
			f.close();
		}
			
			catch(IOException e) {
				System.out.println(e.toString());
			}
	}
}
