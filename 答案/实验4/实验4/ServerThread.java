package ʵ��_Java�߼����.ʵ��4;

import java.io.*;
import java.net.*;
import java.util.*;

class ServerThread extends Thread {
	Socket socket;
	DataInputStream in=null; 
	DataOutputStream out=null;
	   
	public ServerThread(Socket t) {
		socket=t;
		try  { 
			out=new DataOutputStream(socket.getOutputStream()); 
			in=new DataInputStream(socket.getInputStream());
		}catch (IOException e) {
			e.printStackTrace();
		}
	}  
	
	public void run() { 
		while(true){
			try{
				String item = in.readUTF(); 
				Scanner scanner = new Scanner(item);
				scanner.useDelimiter("[^0123456789.]+"); //ʹ��������ʽ�����ִ��յ����ַ����н�������
			
				if(item.startsWith("�˵�")) { 
					double sum=0;
					while(scanner.hasNext()){
						try{  
							double price = scanner.nextDouble();
							sum = sum+price;
							System.out.println(price);
						}catch(InputMismatchException exp){
							String t = scanner.next();//���Ļس�
						}
					} 
					System.out.println("�����ܶ"+sum+"\n");
					//���͵��ͻ���
					out.writeUTF("�����˵�:");
					out.writeUTF(item);
					out.writeUTF("�ܶ�:"+sum+"Ԫ");  
				}
			}catch(IOException exp){
				System.out.println("�ͻ��ѶϿ�\n");
				break;
			}
		}
	} 
}
