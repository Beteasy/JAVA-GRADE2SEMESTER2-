import java.io.*;
import java.net.*;
import java.util.*;

public class Host2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] dataOut = null;
		DatagramPacket dataPackSend = null;
		DatagramSocket mailOut = null;
		Scanner scanner = new Scanner(System.in);
		String IP = new String("127.0.0.1");
		int sendPort = 6666;
		
		Host2Class hostClass = new Host2Class();
		Thread thread =new Thread(hostClass);
		thread.start();
		
		System.out.println("*************running**********");
		while(true) {
			dataOut = scanner.nextLine().getBytes();
			try {
				dataPackSend = new DatagramPacket(dataOut,dataOut.length,InetAddress.getByName(IP),6666);
				mailOut = new DatagramSocket();
				mailOut.send(dataPackSend);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class Host2Class implements Runnable{
	
	byte[] dataOut = null;
	byte[] dataIn = null;
	DatagramPacket dataPackSend = null;
	DatagramPacket dataPackReceive = null;
	DatagramSocket mailOut = null;
	DatagramSocket mailReceive = null;
	Scanner scanner = new Scanner(System.in);
	String IP = new String("127.0.0.1");
	int receivePort = 2333;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		dataIn = new byte[8192];
		String str= "";
		try {
			dataPackReceive = new DatagramPacket(dataIn,dataIn.length);
			mailReceive = new DatagramSocket(receivePort);
		} catch (SocketException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(true) {
			try {
				if(mailReceive == null) {
					System.out.println("mailReceive failed");
					mailReceive = new DatagramSocket(2333);
					break;
				}
				else {
					mailReceive.receive(dataPackReceive);
					//how to get the data
					str = new String(dataPackReceive.getData(),0,dataPackReceive.getLength());
					System.out.println(str);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}