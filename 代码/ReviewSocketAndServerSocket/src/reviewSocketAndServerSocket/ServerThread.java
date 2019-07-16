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
		//流在哪里创建
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
				System.out.println("客户离开");
				return;
			}
			System.out.println("总额为："+sum);
			try {
				out.writeUTF("总额："+sum);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
