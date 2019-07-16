package shiyan3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DeleteWindow extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	JTextField usernameText;
	JButton deleteButton;
	DBUtil util = new DBUtil();
	UserDao userdao = new UserDao(util.getConnection());
	
	DeleteWindow(){
		init();
		this.setBounds(600, 300, 300, 200);
		this.setTitle("ɾ���û�");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	void init(){
		this.setLayout(new FlowLayout());
		Box boxBase,boxV1,boxV2,boxH1,boxH2;
		boxV1 = Box.createVerticalBox();
		boxV2 = Box.createVerticalBox();
		boxBase = Box.createVerticalBox();
		boxH1 = Box.createHorizontalBox();
		boxH2 = Box.createHorizontalBox();
		
		usernameText = new JTextField(15);
		deleteButton = new JButton("ɾ��");
		
		boxV1.add(Box.createVerticalStrut(20));
		boxV1.add(new Label("�û���"));
		
		boxV2.add(Box.createVerticalStrut(20));
		boxV2.add(usernameText);
		
		boxH1.add(boxV1);
		boxH1.add(Box.createHorizontalStrut(8));
		boxH1.add(boxV2);
		
		boxH2.add(deleteButton);
		
		boxBase.add(boxH1);
		boxBase.add(Box.createVerticalStrut(20));
		boxBase.add(boxH2);
		
		this.add(boxBase);
		
		deleteButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(usernameText.getText().length()==0) {
			JOptionPane.showMessageDialog(null, "������Ҫɾ�����û�", "ɾ��ʧ��", JOptionPane.WARNING_MESSAGE);
		}
		else {
			int result = userdao.delete(usernameText.getText().trim());
			if(result==0) {
				JOptionPane.showMessageDialog(null, "ɾ��ʧ��\n�����ڸ��û�", "ɾ��ʧ��", JOptionPane.WARNING_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "ɾ���ɹ�\nɾ���û�Ϊ:"+usernameText.getText(), "ɾ���ɹ�", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

}
