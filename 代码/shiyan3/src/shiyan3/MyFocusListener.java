package shiyan3;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MyFocusListener implements FocusListener{
	
	JTextField usernameText;
	JLabel label;
	
	public void setUsernameText(JTextField usernameText) {
		this.usernameText = usernameText;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		if(usernameText.getText().equals("�������û���")){
			usernameText.setText("");
		}
		label.setForeground(Color.black);
		label.setText("<html><body>�û����ĳ���<br />������14</body></html>");
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		if(usernameText.getText().equals("")){
			usernameText.setText("�������û���");
		}
	}

}
