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
		socket = new Socket();		//���socket�ͺ���catch�е���ʲô��ϵ
		connection = new JButton("���ӷ�����");
		send = new JButton("����");
		send.setEnabled(false);
		inputText = new JTextField(6);
		showResult = new JTextArea();
		this.add(connection,BorderLayout.NORTH);
		JPanel pSouth = new JPanel();
		pSouth.add(new JLabel("������Բ�İ뾶:"));
		pSouth.add(inputText);
		pSouth.add(send);
		this.add(new JScrollPane(showResult),BorderLayout.CENTER);
		this.add(pSouth,BorderLayout.SOUTH);
		connection.addActionListener(this);
		send.addActionListener(this);
		thread = new Thread(this);		//����ͺ�����ʲô��ϵ
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
					if(!(thread.isAlive())) {		//����߳�����ô���� Ϊʲô��ô��
						thread = new Thread(this);
						thread.start();
					}
				}
			}
			catch(IOException ee){
				System.out.print(ee);
				socket = new Socket();		//Ϊʲô�����´���socket
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
				showResult.setText("��������ѶϿ�"+ee);
				socket = new Socket();	//�ظ��������⼸��socketʲô��˼
				break;
			}
		}
	}
	
}