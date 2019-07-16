package shiyan1;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class MyListener implements ActionListener{
	
	JTextField username;
	JPasswordField password;
	JLabel label;
	
	public void setUsername(JTextField username) {
		this.username = username;
	}
	
	public void setPassword(JPasswordField password) {
		this.password = password;
	}
	
	public void setLabel(JLabel label) {
		this.label = label;
	}
	
	//@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			
			String str_username = username.getText();
			char[] str_password = password.getPassword();
			
			//如果用户名的长度大于14，则作出提示
			if(str_username.length()>14) {
				
				label.setForeground(Color.red);
				label.setText("<html><body>用户名长度<br />不能超过14<br />请重新输入</body></html>");
			}
			
			//若用户名和密码为空时弹出窗口进行提示
			else if(str_username.length()==0 || str_password.length==0)
			{
				JFrame fault = new JFrame();
				fault.setVisible(true);
				fault.setTitle("注册失败");
				fault.setBounds(250, 250, 250, 150);
				fault.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				JPanel panel = new JPanel();
				fault.setContentPane(panel);
				JTextArea area = new JTextArea(15,23);
				area.setText("注册失败！！！\n用户名或密码不能为空");
				panel.add(area);
			}
			
			//用户名和密码符合要求，弹出窗口进行提示
			else {
				JFrame success = new JFrame();
				success.setVisible(true);
				success.setTitle("注册成功");
				success.setBounds(250, 250, 250, 150);
				success.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				JPanel panel = new JPanel();
				success.setContentPane(panel);
				JTextArea area = new JTextArea(15,23);
				area.setText("注册成功\n用户名为:"+str_username+"\n密码为:"+String.valueOf(str_password));
				panel.add(area);
			}
		}
		catch(Exception ee) {
			
		}
	}
}
