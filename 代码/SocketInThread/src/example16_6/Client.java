package example16_6;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new WindowClient();
		
	}
}


	class WindowClient extends JFrame implements Runnable, ActionListener{
	JButton connection, send;
	JTextField inputText;
	JTextArea showResult;
	Socket socket = null;
	DataInputStream in = null;
	DataOutputStream out = null;
	Thread thread;		//attention
	
	WindowClient(){
		socket = new Socket();		//这个socket和后面catch中的有什么联系
		connection = new JButton("连接服务器");
		send = new JButton("发送");
		send.setEnabled(false);
		inputText = new JTextField(6);
		showResult = new JTextArea();
		this.add(connection,BorderLayout.NORTH);
		JPanel pSouth = new JPanel();
		pSouth.add(new JLabel("请输入圆的半径:"));
		pSouth.add(inputText);
		pSouth.add(send);
		this.add(new JScrollPane(showResult),BorderLayout.CENTER);
		this.add(pSouth,BorderLayout.SOUTH);
		connection.addActionListener(this);
		send.addActionListener(this);
		thread = new Thread(this);		//这个和后面有什么联系
		this.setBounds(10, 30, 460, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == connection) {
			try {
				if(socket.isConnected()) {}
				else {
					InetAddress address = InetAddress.getByName("127.0.0.1");
					InetSocketAddress socketAddress = new InetSocketAddress(address,4331);
					socket.connect(socketAddress);
					in = new DataInputStream(socket.getInputStream());
					out = new DataOutputStream(socket.getOutputStream());
					send.setEnabled(true);
					if(!(thread.isAlive())) {		//这个线程是怎么回事 为什么这么做
						thread = new Thread(this);
						thread.start();
					}
				}
			}
			catch(IOException ee){
				System.out.print(ee);
				socket = new Socket();		//为什么又重新创建socket
			}
		}
		if(e.getSource() == send) {
			String s = inputText.getText();
			double r = Double.parseDouble(s);
			try {
				out.writeDouble(r);
			}
			catch(IOException ee) {}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String s =null;
		double result = 0;
		while(true) {
			try {
				s = in.readUTF();
				showResult.append("\ntest"+s);
			}
			catch(IOException ee) {
				showResult.setText("与服务器已断开"+ee);
				socket = new Socket();	//重复创建的这几个socket什么意思
				break;
			}
		}
	}
	
}