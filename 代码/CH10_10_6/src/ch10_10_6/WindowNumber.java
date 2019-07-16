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
		 //此处有疑问：为什么可以直接设置布局，没有添加中间容器
		 setLayout(new FlowLayout());
		 text = new JTextField(10);
		 listener = new PoliceListen();
		 //为事件注册监视器
		 text.addActionListener(listener);
		 this.add(text);
	 }
}
