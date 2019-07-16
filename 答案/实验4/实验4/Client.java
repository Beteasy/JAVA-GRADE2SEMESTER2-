package 实验_Java高级编程.实验4;

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
          thread = new Thread(readThread);   //负责读取信息的线程          
         
          String IP = "127.0.0.1";
          int port = 1880;
                 
          if(!clientSocket.isConnected()){
        	  InetAddress  address=InetAddress.getByName(IP);
              InetSocketAddress socketAddress=new InetSocketAddress(address,port);
              clientSocket.connect(socketAddress); 
              
              InputStream in=clientSocket.getInputStream();			//clientSocket调用getInputStream()返回输入流
              OutputStream out=clientSocket.getOutputStream();		//clientSocket调用getOutputStream()返回输出流
              inData =new DataInputStream(in); 
              outData = new DataOutputStream(out);
              
              readThread.setDataInputStream(inData);
              readThread.setDataOutputStream(outData);
              
              thread.start();  //启动负责读信息的线程              
          }          
       }catch(Exception e) {
    	   e.printStackTrace();
           System.out.println("服务器已断开"+e);
       }
   }
}