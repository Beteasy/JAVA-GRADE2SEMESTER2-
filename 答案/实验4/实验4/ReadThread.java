package ʵ��_Java�߼����.ʵ��4;

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
			System.out.println("�����˵�:");
			String content = scanner.nextLine();
			try{  
				out.writeUTF("�˵�"+content); 
			
				//���տͻ��˷��͵���Ϣ
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
