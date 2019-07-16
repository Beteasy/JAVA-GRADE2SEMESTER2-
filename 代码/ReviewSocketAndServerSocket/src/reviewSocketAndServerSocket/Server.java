import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = null;
		Socket socket = null;
		ServerThread serverThread = null;
		Thread thread;
		int port = 2333;
		
		while(true) {
			try {
				serverSocket = new ServerSocket(port);
				socket = serverSocket.accept();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			serverThread = new ServerThread(socket);
			thread = new Thread(serverThread);
			thread.start();
		}
	}

}
