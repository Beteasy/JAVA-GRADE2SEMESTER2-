package chapter16.Example16_5;

import java.io.*;
import java.net.*;

public class Server {
	
	public static void main(String args[]) {
		ServerSocket server=null;
		Socket you=null;
		
		DataOutputStream out=null;
		DataInputStream  in=null;
		      
		try{ 
			//1、创建一个服务器端Socket，即ServerSocket，指定绑定的端口，并监听此端口
			server=new ServerSocket(4331);
			
			//2、调用accept()方法开始监听，等待客户端的连接
			System.out.println("等待客户呼叫");
			you=server.accept(); //堵塞状态，除非有客户呼叫			
			
			//3、获取输入流，并读取客户端信息
			in=new DataInputStream(you.getInputStream());
			
			//4、获取输出流，响应客户端的请求
			out=new DataOutputStream(you.getOutputStream());
			
			int count=0;
	        while(count++<50){
			//while(true) {
	        	//使用输入流读取Client发送过来的数据
				char c=in.readChar(); 		//in读取信息，堵塞状态
				System.out.println("服务器收到:"+c);
				
				c=(char)(c-32);
				//使用输出流向Client发送数据
				out.writeChar(c);
				System.out.println("服务器发送:"+c);
				Thread.sleep(1000);
				
				 System.out.println();
			}
	        
	        //5、关闭资源
	        in.close();
	        out.close();
	        you.close();
	        server.close();
	        
		}catch (IOException e) {
				e.printStackTrace();
				System.out.println("客户已断开");
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
