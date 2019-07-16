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
	
	//构造方法
	public RegisterWindow() {
		
		init();
		this.setBounds(200, 200, 400, 300);
		this.setVisible(true);
		this.setTitle("用户注册");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//初始化函数
	void init(){

		//设置布局为FlowLayout
		this.setLayout(new FlowLayout());
		
		//声明四个具有列型布局的盒式容器和两个具有行型布局的盒式容器
		Box box_V1, box_V2, box_V3, box_H1, box_H2, box_base;
		box_V1 = Box.createVerticalBox();
		box_V2 = Box.createVerticalBox();
		box_V3 = Box.createVerticalBox();
		box_base = Box.createVerticalBox();
		box_H1 = Box.createHorizontalBox();
		box_H2 = Box.createHorizontalBox();
		
		
		box_V1.add(Box.createVerticalStrut(50));
		box_V1.add(new JLabel("用户名"));
		box_V1.add(Box.createVerticalStrut(50));
		box_V1.add(new JLabel("密码"));

		
		username = new JTextField(15);
		username.setText("请设置用户名");
		box_V2.add(Box.createVerticalStrut(50));
		box_V2.add(username);
		password = new JPasswordField(15);
		box_V2.add(Box.createVerticalStrut(50));
		box_V2.add(password);

		//用于显示用户名的注册规范
		JLabel label = new JLabel();
		label.setFont(new Font("宋体",Font.BOLD,10));
		label.setText("<html><body>用户名的长度<br />不超过14</body></html>");
		box_V3.add(label);
		box_V3.add(Box.createVerticalStrut(25));
		
		//将各个组件添加到容器
		box_H1.add(box_V1);
		box_H1.add(Box.createHorizontalStrut(8));
		box_H1.add(box_V2);
		box_H1.add(Box.createHorizontalStrut(8));
		box_H1.add(box_V3);
		
		this.add(box_base);
		box_base.add(box_H1);
		box_base.add(Box.createVerticalStrut(40));
		box_base.add(box_H2);
		
		//添加注册按钮
		registerButton = new JButton("注册");
		box_H2.add(registerButton);
		
		//添加事件监听器，用于判断用户名和密码是否符合规范，并作出提示
		MyListener myListener = new MyListener();
		myListener.setUsername(username);
		myListener.setPassword(password);
		myListener.setLabel(label);
		registerButton.addActionListener(myListener);
		
		//添加焦点事件监听器
		MyFocusListener myFocusListener = new MyFocusListener();
		myFocusListener.setUsername(username);
		myFocusListener.setLabel(label);
		username.addFocusListener(myFocusListener);
		
		
		
	}
}
