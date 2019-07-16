package ch10_10_6;

import java.awt.event.*;

//监视器继承ActionListener接口
public class PoliceListen implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//重写actionPerformed方法，用于处理事件
		// TODO Auto-generated method stub
		int n=0, m=0;
		String str = e.getActionCommand();
		try {
			//文本框接收到的是一个字符串，需将其转换为数字
			//可能出现转换异常，所以需要异常处理机制
			n = Integer.parseInt(str);
			m = n*n;
			System.out.println(n+"的平方是"+m);
		}
		catch(Exception ee) {
			System.out.println(e.toString());
		}
	}
	

}
