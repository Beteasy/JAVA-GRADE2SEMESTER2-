package 实验_Java高级编程.实验4;

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
				scanner.useDelimiter("[^0123456789.]+"); //使用正则表达式将数字从收到的字符串中解析出来
			
				if(item.startsWith("账单")) { 
					double sum=0;
					while(scanner.hasNext()){
						try{  
							double price = scanner.nextDouble();
							sum = sum+price;
							System.out.println(price);
						}catch(InputMismatchException exp){
							String t = scanner.next();//消耗回车
						}
					} 
					System.out.println("本次总额："+sum+"\n");
					//发送到客户端
					out.writeUTF("您的账单:");
					out.writeUTF(item);
					out.writeUTF("总额:"+sum+"元");  
				}
			}catch(IOException exp){
				System.out.println("客户已断开\n");
				break;
			}
		}
	} 
}
