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
				out.writeChar(c);	//客户向输出流写数据，发送到服务器
				
				char s = in.readChar();		//in读取信息堵塞状态
				System.out.println("客户收到:"+s);
				c++;
				Thread.sleep(500);		//每隔500毫秒进行一次读写
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print("服务器已断开"+e);
		}
	}
		

}
