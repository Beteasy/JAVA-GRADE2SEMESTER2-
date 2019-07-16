package chapter16.Example16_5;

import java.io.*;
import java.net.*;

public class Client {

   public static void main(String args[]) {
      Socket mysocket;
      DataInputStream in=null;
      DataOutputStream out=null;
      
      try{  
    	  //1�������ͻ���Socket��ָ����������ַ�Ͷ˿�
    	  mysocket=new Socket("127.0.0.1", 4331);
          
          //2����ȡ���������������˷�����Ϣ
          out=new DataOutputStream(mysocket.getOutputStream()); 
          
          //3����ȡ������������ȡ�������˵���Ӧ��Ϣ
          in=new DataInputStream(mysocket.getInputStream());
          
          char c='a';
          int count=0;
          while(count++<50){
          //while(true) {
        	  if(c>'z')
                 c='a';
        	  
        	  //ʹ���������Server��������
        	  System.out.println("�ͻ�����:"+c);
              out.writeChar(c);              
               
              //ʹ����������ȡServer���͹���������
              char s=in.readChar(); 	//in��ȡ��Ϣ������״̬
              System.out.println("�ͻ��յ�:"+s);
              c++;
              Thread.sleep(500);
              System.out.println();
          } 
          
          //4���ر���Դ
          in.close();
          out.close();
          mysocket.close();
       }catch(Exception e) {
            System.out.println("�������ѶϿ�"+e);
       }
   } 
}
