package ch10_10_6;

import java.awt.*;

import javax.swing.*;

public class WindowNumber extends JFrame{

	JTextField text;
	PoliceListen listener;
	 public WindowNumber() {
		 init();
		 this.setBounds(100, 100, 150, 150);
		 this.setVisible(true);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
	 
	 void init(){
		 //�˴������ʣ�Ϊʲô����ֱ�����ò��֣�û������м�����
		 setLayout(new FlowLayout());
		 text = new JTextField(10);
		 listener = new PoliceListen();
		 //Ϊ�¼�ע�������
		 text.addActionListener(listener);
		 this.add(text);
	 }
}
