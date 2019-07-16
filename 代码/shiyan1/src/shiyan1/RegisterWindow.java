package shiyan1;

import java.awt.*;
import javax.swing.*;

public class RegisterWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	JTextField username;
	JPasswordField password;
	JButton registerButton;
	
	//���췽��
	public RegisterWindow() {
		
		init();
		this.setBounds(200, 200, 400, 300);
		this.setVisible(true);
		this.setTitle("�û�ע��");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//��ʼ������
	void init(){

		//���ò���ΪFlowLayout
		this.setLayout(new FlowLayout());
		
		//�����ĸ��������Ͳ��ֵĺ�ʽ�����������������Ͳ��ֵĺ�ʽ����
		Box box_V1, box_V2, box_V3, box_H1, box_H2, box_base;
		box_V1 = Box.createVerticalBox();
		box_V2 = Box.createVerticalBox();
		box_V3 = Box.createVerticalBox();
		box_base = Box.createVerticalBox();
		box_H1 = Box.createHorizontalBox();
		box_H2 = Box.createHorizontalBox();
		
		
		box_V1.add(Box.createVerticalStrut(50));
		box_V1.add(new JLabel("�û���"));
		box_V1.add(Box.createVerticalStrut(50));
		box_V1.add(new JLabel("����"));

		
		username = new JTextField(15);
		username.setText("�������û���");
		box_V2.add(Box.createVerticalStrut(50));
		box_V2.add(username);
		password = new JPasswordField(15);
		box_V2.add(Box.createVerticalStrut(50));
		box_V2.add(password);

		//������ʾ�û�����ע��淶
		JLabel label = new JLabel();
		label.setFont(new Font("����",Font.BOLD,10));
		label.setText("<html><body>�û����ĳ���<br />������14</body></html>");
		box_V3.add(label);
		box_V3.add(Box.createVerticalStrut(25));
		
		//�����������ӵ�����
		box_H1.add(box_V1);
		box_H1.add(Box.createHorizontalStrut(8));
		box_H1.add(box_V2);
		box_H1.add(Box.createHorizontalStrut(8));
		box_H1.add(box_V3);
		
		this.add(box_base);
		box_base.add(box_H1);
		box_base.add(Box.createVerticalStrut(40));
		box_base.add(box_H2);
		
		//���ע�ᰴť
		registerButton = new JButton("ע��");
		box_H2.add(registerButton);
		
		//����¼��������������ж��û����������Ƿ���Ϲ淶����������ʾ
		MyListener myListener = new MyListener();
		myListener.setUsername(username);
		myListener.setPassword(password);
		myListener.setLabel(label);
		registerButton.addActionListener(myListener);
		
		//��ӽ����¼�������
		MyFocusListener myFocusListener = new MyFocusListener();
		myFocusListener.setUsername(username);
		myFocusListener.setLabel(label);
		username.addFocusListener(myFocusListener);
		
		
		
	}
}
