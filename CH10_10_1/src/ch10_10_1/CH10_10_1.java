package ch10_10_1;

import java.awt.*;

import javax.swing.*;

public class CH10_10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame window1 = new JFrame("window1");
		window1.setBounds(200, 200, 400, 400);
		window1.setVisible(true);
		//window1.setExtendedState();
		window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container con = window1.getContentPane();
		con.setBackground(Color.blue);
		
		
		JFrame window2 = new JFrame("window2");
		window2.setBounds(600, 200, 400, 400);
		window2.setVisible(true);
		window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//菜单栏
		JMenuBar menuBar = new JMenuBar();
		
		//菜单
		JMenu file = new JMenu("文件");
		JMenu edit = new JMenu("编辑");
		JMenu format = new JMenu("格式");
		JMenu view = new JMenu("查看");
		JMenu help = new JMenu("帮助");
		
		//菜单项
		JMenuItem newfile = new JMenuItem("新建");
		JMenuItem openfile = new JMenuItem("打开");
		JMenuItem save = new JMenuItem("保存");
		JMenuItem saveAs = new JMenuItem("另存为");
		JMenuItem setPage = new JMenuItem("页面设置");
		JMenuItem print = new JMenuItem("打印");
		JMenuItem exit = new JMenuItem("退出");
		
		//将菜单项添加到菜单中
		file.add(newfile);
		file.add(openfile);
		file.add(save);
		file.add(saveAs);
		file.add(setPage);
		file.add(print);
		file.add(exit);         
		
		//将菜单添加到菜单栏中
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(format);
		menuBar.add(view);
		menuBar.add(help);
		
		//将菜单栏添加到窗口
		window2.setJMenuBar(menuBar);
		}

}
