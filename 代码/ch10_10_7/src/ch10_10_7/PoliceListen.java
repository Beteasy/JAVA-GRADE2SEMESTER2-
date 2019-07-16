package ch10_10_7;

import java.awt.event.*;

import javax.swing.*;


//监视器继承ActionListener接口
public class PoliceListen implements ActionListener{
	
	JTextField text;
	public void setJTextField(JTextField text) {
		this.text = text;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//重写actionPerformed方法，用于处理事件
		// TODO Auto-generated method stub
		int n=0, m=0;
		
		//ActionEvent事件调用getSource方法获取actionEvent事件的事件源对象的引用
		//在这里就是输入的文本框
		JTextField textSource = (JTextField)e.getSource();
		String str = textSource.getText();
		
		if(!str.isEmpty()) {
			try {
				//文本框接收到的是一个字符串，需将其转换为数字
				//可能出现转换异常，所以需要异常处理机制
				n = Integer.parseInt(str);
				m = n*n;
				text.setText(""+m);
			}
			catch(Exception ee) {
				textSource.setText("请输入数字");
			}
		}
		
	}
	

}
