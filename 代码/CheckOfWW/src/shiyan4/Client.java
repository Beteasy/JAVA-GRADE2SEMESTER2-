package shiyan4;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		
		Socket socket = null;
		DataInputStream inputStream = null;
		DataOutputStream outputStream = null;
		
		ReadThread readThread = null;
		Thread thread = null;
		
		try {
			socket = new Socket();
			readThread = new ReadThread();
			thread = new Thread(readThread);
			if(!socket.isConnected()) {
				InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
				InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, 1880);
				socket.connect(inetSocketAddress);
				
				inputStream = new DataInputStream(socket.getInputStream());
				outputStream = new DataOutputStream(socket.getOutputStream());
				
				readThread.setin(inputStream);
				readThread.setout(outputStream);
				
				thread.start();
		
				}
			}
			catch(Exception e) {
				System.out.println("�������ѶϿ�" + e);
		
			}
		
		
	}
}
