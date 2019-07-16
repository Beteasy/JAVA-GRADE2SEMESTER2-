package ʵ��_Java�߼����.ʵ��4;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client  {
	
   public static void main(String args[]) {
      Socket clientSocket=null;
      DataInputStream inData=null;
      DataOutputStream outData=null;
      
      ReadThread readThread=null;
      Thread thread; 
      
      try{  
    	  clientSocket=new Socket();
    	  
    	  readThread = new ReadThread();   
          thread = new Thread(readThread);   //�����ȡ��Ϣ���߳�          
         
          String IP = "127.0.0.1";
          int port = 1880;
                 
          if(!clientSocket.isConnected()){
        	  InetAddress  address=InetAddress.getByName(IP);
              InetSocketAddress socketAddress=new InetSocketAddress(address,port);
              clientSocket.connect(socketAddress); 
              
              InputStream in=clientSocket.getInputStream();			//clientSocket����getInputStream()����������
              OutputStream out=clientSocket.getOutputStream();		//clientSocket����getOutputStream()���������
              inData =new DataInputStream(in); 
              outData = new DataOutputStream(out);
              
              readThread.setDataInputStream(inData);
              readThread.setDataOutputStream(outData);
              
              thread.start();  //�����������Ϣ���߳�              
          }          
       }catch(Exception e) {
    	   e.printStackTrace();
           System.out.println("�������ѶϿ�"+e);
       }
   }
}