package shiyan4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ServerThread extends Thread {
	Socket socket = null;
	DataInputStream inputStream = null;
	DataOutputStream outputStream = null;
	String s = null;
	public ServerThread(Socket socket){
		this.socket = socket;	
		try {
			inputStream = new DataInputStream(socket.getInputStream());
			outputStream = new DataOutputStream(socket.getOutputStream());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void run() {
		while(true) {
			try {
				double sum = 0;
				s = inputStream.readUTF();
				String str[] = s.split("[^\\d+\\.?\\d*]+");
				for(int i = 1 ; i < str.length ; i ++) {
					System.out.println(Double.parseDouble(str[i]));
					sum += Double.parseDouble(str[i]);
				}
				System.out.println("本次总额：" + sum);
				outputStream.writeUTF("您的账单：\n账单" + s + "\n总额：" + sum + "元");
				
			}catch(Exception e) {
				System.out.println("客户离开");
				return;
			}
		}
	}
	
}
