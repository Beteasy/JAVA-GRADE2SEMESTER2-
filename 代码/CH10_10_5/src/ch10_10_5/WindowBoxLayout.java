package ch10_10_5;

import java.awt.*;

import javax.swing.*;

public class WindowBoxLayout extends JFrame{

	Box baseBox, boxV1, boxV2, boxV3;
	
	public WindowBoxLayout() {
		setLayout(new FlowLayout());
		init();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void init() {
		boxV1 = Box.createVerticalBox();
		boxV1.add(Box.createVerticalStrut(30));
		boxV1.add(new JLabel("����"));
		boxV1.add(Box.createVerticalStrut(30));
		boxV1.add(new JLabel("email"));
		boxV1.add(Box.createVerticalStrut(30));
		boxV1.add(new JLabel("ְҵ"));
		
		boxV2 = Box.createVerticalBox();
		boxV2.add(Box.createVerticalStrut(30));
		JTextField username = new JTextField(10);
		username.setText("�������û���");
		boxV2.add(username);
		boxV2.add(Box.createVerticalStrut(30));
		boxV2.add(new JTextField(10));
		boxV2.add(Box.createVerticalStrut(30));
		boxV2.add(new JTextField(10));
		
		boxV3 = Box.createVerticalBox();
		//boxV3.add(Box.createVerticalStrut(30));
		JLabel label = new JLabel();
		label.setFont(new Font("����",Font.BOLD,10));
		label.setText("<html><body>�û����ĳ���<br />������14</body></html>");
		boxV3.add(label);
		boxV3.add(Box.createVerticalStrut(75));
		baseBox = Box.createHorizontalBox();
		baseBox.add(boxV1);
		baseBox.add(Box.createHorizontalStrut(10));
		baseBox.add(boxV2);
		baseBox.add(Box.createHorizontalStrut(10));
		baseBox.add(boxV3);
		add(baseBox);
	}
	
}
