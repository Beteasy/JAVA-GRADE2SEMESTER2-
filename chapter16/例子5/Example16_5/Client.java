package chapter16.Example16_5;

import java.io.*;
import java.net.*;

public class Client {

   public static void main(String args[]) {
      Socket mysocket;
      DataInputStream in=null;
      DataOutputStream out=null;
      
      try{  
    	  //1、创建客户端Socket，指定服务器地址和端口
    	  mysocket=new Socket("127.0.0.1", 4331);
          
          //2、获取输出流，向服务器端发送信息
          out=new DataOutputStream(mysocket.getOutputStream()); 
          
          //3、获取输入流，并读取服务器端的响应信息
          in=new DataInputStream(mysocket.getInputStream());
          
          char c='a';
          int count=0;
          while(count++<50){
          //while(true) {
        	  if(c>'z')
                 c='a';
        	  
        	  //使用输出流向Server发送数据
        	  System.out.println("客户发送:"+c);
              out.writeChar(c);              
               
              //使用输入流读取Server发送过来的数据
              char s=in.readChar(); 	//in读取信息，堵塞状态
              System.out.println("客户收到:"+s);
              c++;
              Thread.sleep(500);
              System.out.println();
          } 
          
          //4、关闭资源
          in.close();
          out.close();
          mysocket.close();
       }catch(Exception e) {
            System.out.println("服务器已断开"+e);
       }
   } 
}
