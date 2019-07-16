package containers;

import java.awt.*;

import javax.swing.*;

public class Containers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame1 =  new JFrame("拆分窗口");
		JFrame frame2 =  new JFrame("分层窗口");
		//JFrame frame3 =  new JFrame("拆分窗口");
		frame1.setBounds(100,100,300,300);
		frame2.setBounds(600,100,300,300);
		frame1.setVisible(true);
		frame2.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel panel1 = new JPanel();
		//JPanel panel2 = new JPanel();
		//frame1.setContentPane(panel1);
		//frame2.setContentPane(panel2);
		JButton bu =  new JButton("cancle");
		JTextArea text = new JTextArea(4,4);
		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,bu,text);
		//split.
//		split.add(text);
		frame1.setContentPane(split);
		//JLayeredPane lay = JLayeredPane();
		}

}
