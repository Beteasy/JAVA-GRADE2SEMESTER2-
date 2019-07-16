package shiyan3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UpdateWindow extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	JLabel usernameLabel, passwordLabel;
	JTextField usernameText;
	JPasswordField passwordFiled;
	JButton updateButton;
	DBUtil util = new DBUtil();
	UserDao userdao = new UserDao(util.getConnection());
	
	UpdateWindow(){
		init();
		this.setBounds(600, 300, 300, 200);
		this.setTitle("查询用户");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	void init() {
		this.setLayout(new FlowLayout());
		
		Box boxV1, boxV2, boxBase, boxH1, boxH2;
		boxV1 = Box.createVerticalBox();
		boxV2 = Box.createVerticalBox();
		boxBase = Box.createVerticalBox();
		boxH1 = Box.createHorizontalBox();
		boxH2 = Box.createHorizontalBox();
		
		usernameLabel = new JLabel("用户名");
		passwordLabel = new JLabel("密码");
		usernameText = new JTextField(15);
		passwordFiled = new JPasswordField(15);
		updateButton = new JButton("更新");
		
		boxV1.add(Box.createVerticalStrut(20));
		boxV1.add(usernameLabel);
		boxV1.add(Box.createVerticalStrut(20));
		boxV1.add(passwordLabel);
		boxV2.add(Box.createVerticalStrut(20));
		boxV2.add(usernameText);
		boxV2.add(Box.createVerticalStrut(20));
		boxV2.add(passwordFiled);
		boxH1.add(boxV1);
		boxH1.add(Box.createHorizontalStrut(8));
		boxH1.add(boxV2);
		boxH2.add(updateButton);
		boxBase.add(boxH1);
		boxBase.add(Box.createVerticalStrut(20));
		boxBase.add(boxH2);
		this.add(boxBase);
		updateButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int result;
		String username = usernameText.getText().trim();
		String password = String.valueOf(passwordFiled.getPassword());
		result = userdao.update(username,password);
		if(result == 0) {
			JOptionPane.showMessageDialog(this, "更新失败", "更新失败", JOptionPane.WARNING_MESSAGE);
		}
		else {
			String str = "更新成功\n更新后的密码为:"+password;
			JOptionPane.showMessageDialog(this, str, "更新成功", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
