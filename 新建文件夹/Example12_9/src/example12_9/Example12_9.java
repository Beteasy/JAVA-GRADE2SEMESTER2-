package example12_9;

import java.io.*;

public class Example12_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomAccessFile inAndOut = null;
		int data[] = {1,2,3,4,5,6,7,8,9,10};
		try {
			inAndOut = new RandomAccessFile("tom.dat","rw");
			for(int i=0; i<data.length; i++) {
				inAndOut.writeInt(data[i]);
			}
			for(long i=data.length-1;i>=0;i--) {
				inAndOut.seek(i*4);
				System.out.println(","+inAndOut.readInt());
			}
			inAndOut.close();
		}
		catch(IOException e) {};
	}

}
