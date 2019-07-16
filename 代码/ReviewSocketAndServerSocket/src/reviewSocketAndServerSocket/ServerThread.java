package reviewSocketAndServerSocket;

import java.io.*;
import java.net.*;

public class ServerThread implements Runnable{
	
	Socket socket = null;
	DataInputStream in = null;
	DataOutputStream out = null;
	String str;
	String regex = "\\D+";
	String[] result = null;
	double sum = 0;
	
	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//�������ﴴ��
		try {
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true) {
			try {
				str = in.readUTF();
				result = str.split(regex);
				for(int i=1; i<result.length; i++) {
					System.out.println(result[i]);
					sum += Integer.parseInt(result[i]);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("�ͻ��뿪");
				return;
			}
			System.out.println("�ܶ�Ϊ��"+sum);
			try {
				out.writeUTF("�ܶ"+sum);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
