package socket;

import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socket client = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		
		try {
			client = new Socket("127.0.0.1",2333);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			in  = new DataInputStream(client.getInputStream());
			out = new DataOutputStream(client.getOutputStream());
			char c = 'a';
			while(true) {
				if(c>'z') {
					c = 'a';
				}
				out.writeChar(c);	//�ͻ��������д���ݣ����͵�������
				
				char s = in.readChar();		//in��ȡ��Ϣ����״̬
				System.out.println("�ͻ��յ�:"+s);
				c++;
				Thread.sleep(500);		//ÿ��500�������һ�ζ�д
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print("�������ѶϿ�"+e);
		}
	}
		

}
