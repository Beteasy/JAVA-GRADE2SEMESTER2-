package shiyan3;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class SearchWindow extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	JLabel label;
	JTextField usernameText;
	JButton searchButton;
	JScrollPane scroll;
	JTextArea area;
	DBUtil util = new DBUtil();
	UserDao userdao = new UserDao(util.getConnection());
	
	SearchWindow(){
		init();
		this.setBounds(600, 300, 300, 200);
		this.setTitle("��ѯ�û�");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	void init() {
		this.setLayout(new FlowLayout());
		
		Box boxH1, boxH2, boxBase;
		
		boxH1 = Box.createHorizontalBox();
		boxH2 = Box.createHorizontalBox();
		boxBase = Box.createVerticalBox();
		
		label = new JLabel("�û���");
		usernameText = new JTextField(10);
		searchButton = new JButton("��ѯ");
		area = new JTextArea(4,8);
		scroll = new JScrollPane(area);
		
		boxH1.add(label);
		boxH1.add(usernameText);
		boxH1.add(searchButton);
		boxH2.add(scroll);
		boxBase.add(Box.createVerticalStrut(20));
		boxBase.add(boxH1);
		boxBase.add(Box.createVerticalStrut(20));
		boxBase.add(boxH2);
		this.add(boxBase);
		
		searchButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		User user;
		user = userdao.query(usernameText.getText().trim());
		if(user == null) {
			area.setText("���û�������");
		}
		else {
			area.setText("�û���Ϊ:"+user.getUsername()+"\n����Ϊ:"+String.valueOf(user.getPassword()));
		}
	}

}
