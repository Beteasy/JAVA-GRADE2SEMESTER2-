package ch10_10_7;

import java.awt.*;

import javax.swing.*;

public class WindowNumber extends JFrame{

	JTextField textInput, textShow;
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
		 textInput = new JTextField(10);
		 textShow = new JTextField(10);
		 textShow.setEditable(false);
		 listener = new PoliceListen();
		 listener.setJTextField(textShow);
		 //为事件注册监视器
		 textInput.addActionListener(listener);
		 this.add(textInput);
		 this.add(textShow);
	 }
}