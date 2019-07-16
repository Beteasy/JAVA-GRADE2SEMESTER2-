package concatenateWindow;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ConcatenateWindow extends JFrame implements ActionListener{
	JTextField firstStr;
	JTextField secondStr;
	JTextField resultStr;
	JButton contactButton;
	JButton resetButton;

	public ConcatenateWindow() {
		init();
		this.setBounds(200, 200, 650, 200);
		this.setVisible(true);
		this.setTitle("�����ַ���");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void init() {
		firstStr = new JTextField(10);
		secondStr = new JTextField(10);
		resultStr = new JTextField(20);
		contactButton = new JButton("�����ַ���");
		resetButton = new JButton("����");
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(firstStr);
		panel.add(new JLabel("+"));
		panel.add(secondStr);
		panel.add(contactButton);
		panel.add(resultStr);
		panel.add(resetButton);
		
		contactButton.addActionListener(this);
		resetButton.addActionListener(this);
		
		this.setContentPane(panel);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==contactButton) {
			resultStr.setText(firstStr.getText().trim()+secondStr.getText().trim());
		}
		
		if(e.getSource()==resetButton) {
			firstStr.setText("");
			secondStr.setText("");
			resultStr.setText("");
		}
	}
	
}
