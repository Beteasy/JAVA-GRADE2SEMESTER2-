package 实验_Java高级编程.实验4;

import java.io.*;
import java.util.*;
import java.net.*;

class ReadThread implements Runnable {
	Scanner scanner = new Scanner(System.in);
	DataInputStream in;
	DataOutputStream out;
	   
	public void setDataInputStream(DataInputStream in) {
		this.in = in;
	}
	   
	public void setDataOutputStream(DataOutputStream out) {
		this.out = out;
	}
	   
	public void run() {
		while(true){
			System.out.println("输入账单:");
			String content = scanner.nextLine();
			try{  
				out.writeUTF("账单"+content); 
			
				//接收客户端发送的信息
				String str = in.readUTF();
				System.out.println(str);
			
				str = in.readUTF();
				System.out.println(str);
			
				str = in.readUTF();
				System.out.println(str+"\n");
				Thread.sleep(100);
			}catch(Exception e) {
				e.printStackTrace();
			}    
		}
		
	}
	}
