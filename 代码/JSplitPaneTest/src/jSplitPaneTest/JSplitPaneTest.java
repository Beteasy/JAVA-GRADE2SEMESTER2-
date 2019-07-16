package jSplitPaneTest;

import javax.swing.*;

public class JSplitPaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame win = new JFrame();
		win.setBounds(200, 200, 200, 200);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("anniu");
		JTextArea area = new JTextArea(10,10);
		
		JSplitPane pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,button,area);
		
		win.setContentPane(pane);
	}

}
