package socket;

import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerSocket server = null;
		Socket client;
		DataInputStream in = null;
		DataOutputStream out = null;
		
		try {
			server = new ServerSocket(2333);
			client = server.accept();
			in = new DataInputStream(client.getInputStream());
			out  = new DataOutputStream(client.getOutputStream());
			while(true) {
				char c = in.readChar();
				out.writeChar((char)c-32);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print("客户端已断开"+e);
		}
		
	}

}
