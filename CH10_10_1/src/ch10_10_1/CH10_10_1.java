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
		
		//�˵���
		JMenuBar menuBar = new JMenuBar();
		
		//�˵�
		JMenu file = new JMenu("�ļ�");
		JMenu edit = new JMenu("�༭");
		JMenu format = new JMenu("��ʽ");
		JMenu view = new JMenu("�鿴");
		JMenu help = new JMenu("����");
		
		//�˵���
		JMenuItem newfile = new JMenuItem("�½�");
		JMenuItem openfile = new JMenuItem("��");
		JMenuItem save = new JMenuItem("����");
		JMenuItem saveAs = new JMenuItem("���Ϊ");
		JMenuItem setPage = new JMenuItem("ҳ������");
		JMenuItem print = new JMenuItem("��ӡ");
		JMenuItem exit = new JMenuItem("�˳�");
		
		//���˵�����ӵ��˵���
		file.add(newfile);
		file.add(openfile);
		file.add(save);
		file.add(saveAs);
		file.add(setPage);
		file.add(print);
		file.add(exit);         
		
		//���˵���ӵ��˵�����
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(format);
		menuBar.add(view);
		menuBar.add(help);
		
		//���˵�����ӵ�����
		window2.setJMenuBar(menuBar);
		}

}
