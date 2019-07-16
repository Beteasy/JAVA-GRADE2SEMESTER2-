package shiyan3;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SignUpWindow extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	JLabel label;
	JTextField usernameText;
	JPasswordField passwordField;
	JButton signUpButton;
	User user;
	DBUtil util = new DBUtil();
	UserDao userdao = new UserDao(util.getConnection());
	
	SignUpWindow(){
		init();
		this.setBounds(600, 300, 400, 300);
		this.setTitle("新用户注册");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	void init(){
		this.setLayout(new FlowLayout());
		Box boxBase,boxV1,boxV2,boxV3,boxH1,boxH2;
		boxV1 = Box.createVerticalBox();
		boxV2 = Box.createVerticalBox();
		boxV3 = Box.createVerticalBox();
		boxBase = Box.createVerticalBox();
		boxH1 = Box.createHorizontalBox();
		boxH2 = Box.createHorizontalBox();
				
		boxV1.add(Box.createVerticalStrut(50));
		boxV1.add(new JLabel("用户名"));
		boxV1.add(Box.createVerticalStrut(50));
		boxV1.add(new JLabel("密    码"));
				
		usernameText = new JTextField(15);
		usernameText.setText("请设置用户名");
		boxV2.add(Box.createVerticalStrut(50));
		boxV2.add(usernameText);
		passwordField = new JPasswordField(15);
		boxV2.add(Box.createVerticalStrut(50));
		boxV2.add(passwordField);

		//用于显示用户名的注册规范
		JLabel label = new JLabel();
		label.setFont(new Font("宋体",Font.BOLD,10));
		label.setText("<html><body>用户名的长度<br />不超过14</body></html>");
		boxV3.add(label);
		boxV3.add(Box.createVerticalStrut(25));
				
		//将各个组件添加到容器
		boxH1.add(boxV1);
		boxH1.add(Box.createHorizontalStrut(8));
		boxH1.add(boxV2);
		boxH1.add(Box.createHorizontalStrut(8));
		boxH1.add(boxV3);
				
		//添加注册按钮
		signUpButton = new JButton("注册");
		boxH2.add(signUpButton);
		
		boxBase.add(boxH1);
		boxBase.add(Box.createVerticalStrut(40));
		boxBase.add(boxH2);
		
		this.add(boxBase);
		
		//添加焦点事件监听器
		MyFocusListener myFocusListener = new MyFocusListener();
		myFocusListener.setUsernameText(usernameText);
		myFocusListener.setLabel(label);
		usernameText.addFocusListener(myFocusListener);
		
		//添加注册事件监视器
		signUpButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//如果用户名的长度大于14，则作出提示
		if(usernameText.getText().length()>14) {
			label.setForeground(Color.RED);
			label.setText("<html><body>用户名长度<br />不能超过14<br />请重新输入</body></html>");
		}
		
		//若用户名和密码为空时弹出窗口进行警告
		else if(usernameText.getText().length()==0 || passwordField.getPassword().length==0) {
			JOptionPane.showMessageDialog(null, "用户名或密码不为空", "警告", JOptionPane.WARNING_MESSAGE);
		}
		
		/*
		 * 用户名和密码符合要求
		 * 将用户注册信息写到数据库
		 * 弹出窗口进行提示
		 */
		else {
			user = new User();
			user.setUsername(usernameText.getText());
			user.setPassword(String.copyValueOf(passwordField.getPassword()));
			boolean flag = userdao.add(user);
			if(flag) {
				//注册成功
				String message = "注册成功\n用户名为:"+usernameText.getText()+"\n密码为:"+String.valueOf(passwordField.getPassword());
				JOptionPane.showMessageDialog(null, message, "注册成功", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				//用户已存在，注册失败
				String message = "注册失败\n用户:"+usernameText.getText()+"已存在";
				JOptionPane.showMessageDialog(null, message, "注册失败", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
	}
}
