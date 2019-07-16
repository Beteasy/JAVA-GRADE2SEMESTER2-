import java.io.IOException;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = null;
		Socket socket = null;
		ServerThread serverThread = null;
		Thread thread;
		int port = 6666;
		
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(true) {
			try {
				
				socket = serverSocket.accept();
				serverThread = new ServerThread(socket);
				thread = new Thread(serverThread);
				thread.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
