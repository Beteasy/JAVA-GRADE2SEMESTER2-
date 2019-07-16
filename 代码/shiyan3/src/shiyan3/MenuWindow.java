package shiyan3;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class MenuWindow extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	JButton signUpButton, deleteButton, searchButton, updateButton, queryButton;
	
	MenuWindow(){
		init();
		this.setBounds(600, 300, 300, 300);
		this.setTitle("�û�����ϵͳ");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void init() {
		this.setLayout(new FlowLayout());
		signUpButton = new JButton("�û�ע��");
		searchButton = new JButton("��ѯ�û�");
		deleteButton = new JButton("ɾ���û�");
		updateButton = new JButton("��������");
		queryButton = new JButton("�����û�");
		Box boxV = Box.createVerticalBox();
		boxV.add(Box.createVerticalStrut(15));
		boxV.add(signUpButton);
		boxV.add(Box.createVerticalStrut(15));
		boxV.add(searchButton);
		boxV.add(Box.createVerticalStrut(15));
		boxV.add(deleteButton);
		boxV.add(Box.createVerticalStrut(15));
		boxV.add(updateButton);
		boxV.add(Box.createVerticalStrut(15));
		boxV.add(queryButton);
		this.add(boxV);
		
		signUpButton.addActionListener(this);
		searchButton.addActionListener(this);
		deleteButton.addActionListener(this);
		updateButton.addActionListener(this);
		queryButton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//����û�ע�ᰴť
		if(e.getSource()==signUpButton) {
			SignUpWindow signUpWindow = new SignUpWindow();
		}
		else if(e.getSource()==searchButton) {
			SearchWindow searchWindow = new SearchWindow();
		}
		else if(e.getSource()==deleteButton) {
			DeleteWindow deleteWindow = new DeleteWindow();
		}
		else if(e.getSource()==updateButton) {
			UpdateWindow updateWindow = new UpdateWindow();
		}
		else if(e.getSource()==queryButton) {
			QueryWindow queryWindow = new QueryWindow();
		}
	}

}
