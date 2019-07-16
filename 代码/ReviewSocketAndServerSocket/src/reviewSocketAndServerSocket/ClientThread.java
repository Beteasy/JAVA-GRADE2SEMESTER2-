package reviewSocketAndServerSocket;

import java.io.*;
import java.util.*;

public class ClientThread implements Runnable{

	DataInputStream in = null;
	DataOutputStream out = null;
	Scanner scanner = new Scanner(System.in);
	String str;
	
	public void setInputStream(DataInputStream in) {
		this.in = in;
	}
	
	public void setOutputStream(DataOutputStream out) {
		this.out = out;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("输入账单：");
			str = scanner.nextLine().trim();
			try {
				out.writeUTF(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("您的账单：");
			try {
				str = in.readUTF();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(str);
		}
	}

}
