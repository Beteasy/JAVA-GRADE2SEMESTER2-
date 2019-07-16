package example16_6;

import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerSocket server = null;
		ServerThread thread;
		Socket you = null;
		while(true) {
			try {
				server = new ServerSocket(4331);
			}
			catch(IOException e1) {
				System.out.println("正在监听");	//serverSocket对象不能重复创建
			}
			try {
				System.out.println("等待客户呼叫");
				you = server.accept();
				System.out.println("客户的地址"+you.getInetAddress());
			}
			catch(IOException e2) {
				System.out.println("正在等待用户");
			}
			if(you != null) {
				new ServerThread(you).start();	//为每个客户启动一个专门的线路
			}
		}
	}
}

   class ServerThread extends Thread{
	Socket socket;
	DataOutputStream out = null;
	DataInputStream in = null;
	String s = null;
	ServerThread(Socket t){
		socket = t;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
		}
		catch(IOException e) {
			
		}
	}
	public void run(){
		while(true) {
			try {
				double r = in.readDouble();
				double area = Math.PI*r*r;
				out.writeUTF("半径是："+r+"的圆的面积："+area);
			}
			catch(IOException e) {
				System.out.println("客户离开");
				return;
			}
		}
	}
}
