package chapter16.Example16_6;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

class  WindowClient extends JFrame implements Runnable,ActionListener {
	Socket socket=null;
	Thread thread; 
	
	JButton connection,send;
	JTextField inputText;
	JTextArea showResult;
	   
	DataInputStream in=null;
	DataOutputStream out=null;
	   
	public WindowClient() {
	      socket=new Socket();
	      thread=new Thread(this); 
	      
	      //��������
	      connection=new JButton("���ӷ�����");
	      send=new JButton("����");
	      send.setEnabled(false);
	      inputText=new JTextField(6);
	      showResult=new JTextArea();	      
	      
	      JPanel pSouth=new JPanel();
	      pSouth.add(new JLabel("����Բ�İ뾶:"));
	      pSouth.add(inputText);
	      pSouth.add(send);
	      
	      add(connection,BorderLayout.NORTH);
	      add(new JScrollPane(showResult),BorderLayout.CENTER);
	      add(pSouth,BorderLayout.SOUTH);
	      
	      connection.addActionListener(this);
	      send.addActionListener(this);		//�رհ�ť����
	      
	      setBounds(10,30,460,400);
	      setVisible(true);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//��ť�¼���action
	public void actionPerformed(ActionEvent e) {
		//�����ӡ���ť��action
		if(e.getSource()==connection) {	    	  
			try { 
				//����ͷ����������׽������ӣ�
				if(!
					socket.isConnected()){
					InetAddress  address=InetAddress.getByName("127.0.0.1");	//��ȡ��ַ
					InetSocketAddress socketAddress=new InetSocketAddress(address,4331);
					socket.connect(socketAddress); //���������������	 
					
					//����socket�������ӵ����롢�����
					in =new DataInputStream(socket.getInputStream());
			        out = new DataOutputStream(socket.getOutputStream());
					
					send.setEnabled(true);			//������ť����					
					if(!(thread.isAlive()))
						thread=new Thread(this);
					thread.start();
				}
			}catch (IOException ee) {
				System.out.println(ee);
				socket=new Socket();
	        }
	      }
	      
		//�����͡���ť��action		
		if(e.getSource()==send) {
	         String s=inputText.getText();
	         if(!s.equals("#")){
	        	 double r=Double.parseDouble(s);	         
	         
	        	 try {	        	 
	        		 out.writeDouble(r);
	        	 }catch(IOException e1){	        		 
	        		 try {
	        			 in.close();
	        			 out.close();
	        			 socket.close();
	        		 } catch (IOException e2) {					
	        			 e2.printStackTrace();
	        		 }	        	 
	        	 }
	         }else{	         
	        	 if(s.equals("#")){//����"#"���ж�����
	        		 try {
	        			 socket.close();
	        		 } catch (IOException e1) {
						e1.printStackTrace();
	        		 }
	        	 }
	         }
		}
	}
	
	public void run() {
		String s=null;
		double result=0;
		while(true) {
			try{ 
	        	s=in.readUTF();				//read���������͵����
	            showResult.append("\n"+s);	//�������ʾ���ı���
	        }catch(IOException e) { 
	        	showResult.setText("��������ѶϿ�"+e);
	        	socket=new Socket();
	        	break;
	        }   
		}
	}
}

