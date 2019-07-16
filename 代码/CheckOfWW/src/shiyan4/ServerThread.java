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
				System.out.println("�����ܶ" + sum);
				outputStream.writeUTF("�����˵���\n�˵�" + s + "\n�ܶ" + sum + "Ԫ");
				
			}catch(Exception e) {
				System.out.println("�ͻ��뿪");
				return;
			}
		}
	}
	
}
