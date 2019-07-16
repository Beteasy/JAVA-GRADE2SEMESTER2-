package example12_ppt;

import java.io.*;

public class Example12_ppt{
	public static void main(String args[ ]) {	
		byte buffer[] = new byte[128];
		System.out.println("请输入数据，回车后保存到文件test.txt");
		System.out.println("输入#则退出");
		
		try {
			FileOutputStream f = new FileOutputStream("test.txt");
			while(true) {
				int n = System.in.read(buffer);
				if(buffer[0]=='#') break;	//#之前有字符不会退出
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
