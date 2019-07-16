package shiyan3;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class QueryWindow extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	JButton queryButton;
	JScrollPane scroll;
	JTextArea area;
	DBUtil util = new DBUtil();
	UserDao userdao = new UserDao(util.getConnection());
	
	QueryWindow(){
		init();
		this.setBounds(600, 300, 300, 300);
		this.setTitle("遍历用户");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	void init() {
		this.setLayout(new FlowLayout());
		
		Box boxH1, boxH2, boxBase;
		
		boxH1 = Box.createHorizontalBox();
		boxH2 = Box.createHorizontalBox();
		boxBase = Box.createVerticalBox();
		
		queryButton = new JButton("遍历");
		area = new JTextArea(8,20);
		scroll = new JScrollPane(area);
		
		boxH1.add(queryButton);
		boxH2.add(scroll);
		boxBase.add(Box.createVerticalStrut(20));
		boxBase.add(boxH1);
		boxBase.add(Box.createVerticalStrut(20));
		boxBase.add(boxH2);
		this.add(boxBase);
		
		queryButton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ResultSet rs = userdao.queryAll();
		if(rs != null) {
			try {
				while(rs.next()) {
					area.append(rs.getString("username")+"\t"+rs.getString("password")+"\n");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else {
			area.setText("数据库为空");
		}
	}

}
