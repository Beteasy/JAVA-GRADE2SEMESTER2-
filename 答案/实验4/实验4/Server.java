package ʵ��_Java�߼����.ʵ��4;

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
				server= new ServerSocket(1880);	//�����ڶ˿�4331�ϸ�������� ServerSocket����
			}catch(IOException e1) { 
				System.out.println("���ڼ���");   
			} 
           
			try{  
				System.out.println("���ڵȴ��ͻ�");
				you= server.accept(); 			//server����accept()���غͿͻ��������ӵ�Socket����
                System.out.println("�ͻ��ĵ�ַ:"+you.getInetAddress());
			}catch (IOException e) {
				System.out.println(""+e);
			}
			
			if(you!=null) {
				new ServerThread(you).start();  
			}
			
		}
	}
}
