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
			
			//����û����ĳ��ȴ���14����������ʾ
			if(str_username.length()>14) {
				
				label.setForeground(Color.red);
				label.setText("<html><body>�û�������<br />���ܳ���14<br />����������</body></html>");
			}
			
			//���û���������Ϊ��ʱ�������ڽ�����ʾ
			else if(str_username.length()==0 || str_password.length==0)
			{
				JFrame fault = new JFrame();
				fault.setVisible(true);
				fault.setTitle("ע��ʧ��");
				fault.setBounds(250, 250, 250, 150);
				fault.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				JPanel panel = new JPanel();
				fault.setContentPane(panel);
				JTextArea area = new JTextArea(15,23);
				area.setText("ע��ʧ�ܣ�����\n�û��������벻��Ϊ��");
				panel.add(area);
			}
			
			//�û������������Ҫ�󣬵������ڽ�����ʾ
			else {
				JFrame success = new JFrame();
				success.setVisible(true);
				success.setTitle("ע��ɹ�");
				success.setBounds(250, 250, 250, 150);
				success.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				JPanel panel = new JPanel();
				success.setContentPane(panel);
				JTextArea area = new JTextArea(15,23);
				area.setText("ע��ɹ�\n�û���Ϊ:"+str_username+"\n����Ϊ:"+String.valueOf(str_password));
				panel.add(area);
			}
		}
		catch(Exception ee) {
			
		}
	}
}
