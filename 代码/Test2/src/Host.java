import java.io.*;
import java.net.*;
import java.util.*;

public class Host {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************���ͷ�������**********");
		String str = "test";
		byte[] dataOut = null;
		dataOut = str.getBytes();
		String IP = new String("127.0.0.1");
		DatagramPacket dataPackSend = null;
		DatagramSocket mailOut = null;
		try {
			mailOut = new DatagramSocket();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dataPackSend = new DatagramPacket(dataOut,dataOut.length,InetAddress.getByName(IP),2333);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			mailOut.send(dataPackSend);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Scanner scanner = new Scanner(System.in);
//		
//		int sendPort = 2333;
//		
//		HostClass hostClass = new HostClass();
//		Thread thread =new Thread(hostClass);
//		thread.start();
//		
//		
//		while(true) {
//			dataOut = scanner.nextLine().getBytes();
//			try {
//				dataPackSend = new DatagramPacket(dataOut,dataOut.length,InetAddress.getByName(IP),2333);
//				mailOut = new DatagramSocket();
//				mailOut.send(dataPackSend);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
	}
	
}

//class HostClass implements Runnable{
//	
//	byte[] dataOut = null;
//	byte[] dataIn = null;
//	DatagramPacket dataPackSend = null;
//	DatagramPacket dataPackReceive = null;
//	DatagramSocket mailOut = null;
//	DatagramSocket mailReceive = null;
//	Scanner scanner = new Scanner(System.in);
//	String IP = new String("127.0.0.1");
//	int receivePort = 6666;
//	
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//		
//		
//		dataIn = new byte[8192];
//		dataPackReceive = new DatagramPacket(dataIn,dataIn.length);
//		try {
//			mailReceive = new DatagramSocket(888);
//		} catch (SocketException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		while(true) {
//			try {
//				if(mailReceive == null) {
//					System.out.println("mailReceive failed");
//					break;
//				}
//				else {
//					mailReceive.receive(dataPackReceive);
//					//how to get the data
//					System.out.println(dataPackReceive.getData().toString());
//				}
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//	
//}