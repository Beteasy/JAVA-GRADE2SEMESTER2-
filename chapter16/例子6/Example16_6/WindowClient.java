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
	      
	      //构建窗口
	      connection=new JButton("连接服务器");
	      send=new JButton("发送");
	      send.setEnabled(false);
	      inputText=new JTextField(6);
	      showResult=new JTextArea();	      
	      
	      JPanel pSouth=new JPanel();
	      pSouth.add(new JLabel("输入圆的半径:"));
	      pSouth.add(inputText);
	      pSouth.add(send);
	      
	      add(connection,BorderLayout.NORTH);
	      add(new JScrollPane(showResult),BorderLayout.CENTER);
	      add(pSouth,BorderLayout.SOUTH);
	      
	      connection.addActionListener(this);
	      send.addActionListener(this);		//关闭按钮功能
	      
	      setBounds(10,30,460,400);
	      setVisible(true);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//按钮事件的action
	public void actionPerformed(ActionEvent e) {
		//“连接”按钮的action
		if(e.getSource()==connection) {	    	  
			try { 
				//请求和服务器建立套接字连接：
				if(!
					socket.isConnected()){
					InetAddress  address=InetAddress.getByName("127.0.0.1");	//获取地址
					InetSocketAddress socketAddress=new InetSocketAddress(address,4331);
					socket.connect(socketAddress); //请求与服务器连接	 
					
					//创建socket对象连接的输入、输出流
					in =new DataInputStream(socket.getInputStream());
			        out = new DataOutputStream(socket.getOutputStream());
					
					send.setEnabled(true);			//启动按钮功能					
					if(!(thread.isAlive()))
						thread=new Thread(this);
					thread.start();
				}
			}catch (IOException ee) {
				System.out.println(ee);
				socket=new Socket();
	        }
	      }
	      
		//“发送”按钮的action		
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
	        	 if(s.equals("#")){//输入"#"则中断连接
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
	        	s=in.readUTF();				//read服务器发送的面积
	            showResult.append("\n"+s);	//将面积显示在文本区
	        }catch(IOException e) { 
	        	showResult.setText("与服务器已断开"+e);
	        	socket=new Socket();
	        	break;
	        }   
		}
	}
}

