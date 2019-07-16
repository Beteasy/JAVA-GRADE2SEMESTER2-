package 实验_Java高级编程.实验4;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
	public static void main(String args[]) {
		ServerSocket server=null;
		ServerThread thread;
      
		Socket you=null;
		while(true) { 
			try{  
				server= new ServerSocket(1880);	//创建在端口4331上负责监听的 ServerSocket对象
			}catch(IOException e1) { 
				System.out.println("正在监听");   
			} 
           
			try{  
				System.out.println("正在等待客户");
				you= server.accept(); 			//server调用accept()返回和客户端相连接的Socket对象
                System.out.println("客户的地址:"+you.getInetAddress());
			}catch (IOException e) {
				System.out.println(""+e);
			}
			
			if(you!=null) {
				new ServerThread(you).start();  
			}
			
		}
	}
}
