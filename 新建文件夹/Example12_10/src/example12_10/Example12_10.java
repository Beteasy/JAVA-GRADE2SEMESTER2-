package example12_10;

import java.io.*;

public class Example12_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomAccessFile in = null;
		try {
			in = new RandomAccessFile("Example12_10.txt","rw");
			long length = in.length();
			long position = 0;
			in.seek(position);
			while(position < length) {
				String str = in.readLine();
				byte b[] = str.getBytes("IOS-8859-1");
				str = new String(b);
				position = in.getFilePointer();
				System.out.println(str);
			}
		}
		catch(IOException e) {}
	}

}
