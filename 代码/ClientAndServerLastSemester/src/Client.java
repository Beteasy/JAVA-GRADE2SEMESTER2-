import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socket client = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		String IP = new String("127.0.0.1");
		int port = 6666;
		InetAddress inetAddress = null;
		InetSocketAddress socketAddress = null;
		ClientThread clientThread = null;
		Thread thread = null;
		
		try {
			
				client = new Socket();
				inetAddress = InetAddress.getByName(IP);
				socketAddress = new InetSocketAddress(IP,port);
				client.connect(socketAddress);
				
				in = new DataInputStream(client.getInputStream());
				out = new DataOutputStream(client.getOutputStream());
				
				clientThread = new ClientThread();
				clientThread.setDataInputStream(in);
				clientThread.setDataOutputStream(out);
				thread = new Thread(clientThread);
				thread.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
