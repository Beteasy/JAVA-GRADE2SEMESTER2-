package ch10_10_10;

import java.awt.*;

import javax.swing.*;

public class WindowMouse extends JFrame{

	JTextField text;
	JButton button;
	JTextArea textArea;
	MousePolice police;
	
	WindowMouse(){
		init();
		this.setVisible(true);
		this.setBounds(10, 10, 460, 360);
		this.setTitle("处理鼠标事件");
	}
	
	void init() {
		this.setLayout(new FlowLayout());
		text = new JTextField();
		textArea = new JTextArea(5,28);
		police = new MousePolice();
		police.setJTextArea(textArea);
		text.addMouseListener(police);
		button = new JButton("按钮");
		button.addMouseListener(police);
		this.addMouseListener(police);
		this.add(text);
		this.add(button);
		this.add(new JScrollPane(textArea));
	}
}
