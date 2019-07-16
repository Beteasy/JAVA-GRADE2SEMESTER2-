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
				System.out.println("���ڼ���");	//serverSocket�������ظ�����
			}
			try {
				System.out.println("�ȴ��ͻ�����");
				you = server.accept();
				System.out.println("�ͻ��ĵ�ַ"+you.getInetAddress());
			}
			catch(IOException e2) {
				System.out.println("���ڵȴ��û�");
			}
			if(you != null) {
				new ServerThread(you).start();	//Ϊÿ���ͻ�����һ��ר�ŵ���·
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
				out.writeUTF("�뾶�ǣ�"+r+"��Բ�������"+area);
			}
			catch(IOException e) {
				System.out.println("�ͻ��뿪");
				return;
			}
		}
	}
}
