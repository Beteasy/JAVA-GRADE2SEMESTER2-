package shiyan1;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class MyFocusListener implements FocusListener{
	
	JTextField username = new JTextField();
	JLabel label = new JLabel();
	
	public void setUsername(JTextField username) {
		this.username = username;
	}
	
	public void setLabel(JLabel label) {
		this.label = label;
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		if(username.getText().equals("请设置用户名")){
			username.setText("");
		}
		label.setForeground(Color.black);
		label.setText("<html><body>用户名的长度<br />不超过14</body></html>");
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		if(username.getText().equals("")){
			username.setText("请设置用户名");
		}
	}

}
