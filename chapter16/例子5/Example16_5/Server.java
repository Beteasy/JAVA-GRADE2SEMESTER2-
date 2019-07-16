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
			//1������һ����������Socket����ServerSocket��ָ���󶨵Ķ˿ڣ��������˶˿�
			server=new ServerSocket(4331);
			
			//2������accept()������ʼ�������ȴ��ͻ��˵�����
			System.out.println("�ȴ��ͻ�����");
			you=server.accept(); //����״̬�������пͻ�����			
			
			//3����ȡ������������ȡ�ͻ�����Ϣ
			in=new DataInputStream(you.getInputStream());
			
			//4����ȡ���������Ӧ�ͻ��˵�����
			out=new DataOutputStream(you.getOutputStream());
			
			int count=0;
	        while(count++<50){
			//while(true) {
	        	//ʹ����������ȡClient���͹���������
				char c=in.readChar(); 		//in��ȡ��Ϣ������״̬
				System.out.println("�������յ�:"+c);
				
				c=(char)(c-32);
				//ʹ���������Client��������
				out.writeChar(c);
				System.out.println("����������:"+c);
				Thread.sleep(1000);
				
				 System.out.println();
			}
	        
	        //5���ر���Դ
	        in.close();
	        out.close();
	        you.close();
	        server.close();
	        
		}catch (IOException e) {
				e.printStackTrace();
				System.out.println("�ͻ��ѶϿ�");
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
