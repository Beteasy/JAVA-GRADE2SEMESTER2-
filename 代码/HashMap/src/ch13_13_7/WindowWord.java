package ch13_13_7;

import java.awt.*;

import javax.swing.*;

public class WindowWord extends JFrame{
	JTextField inputText, showText;
	WordPolice police;
	
	WindowWord(){
		setLayout(new FlowLayout());
		inputText = new JTextField(6);
		showText = new JTextField(6);
		add(inputText);
		this.add(showText);
		police = new WordPolice();
		police.setJTextField(showText);
		inputText.addActionListener(police);
		this.setBounds(100, 100, 400, 280);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
