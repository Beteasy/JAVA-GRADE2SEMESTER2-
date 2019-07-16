package ch10_10_10;

import java.awt.event.*;

import javax.swing.*;

public class MousePolice implements MouseListener{

	JTextArea area;
	
	public void setJTextArea(JTextArea area) {
		this.area = area;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getClickCount()>2) {
			area.append("\n���������λ�ã�"+"("+e.getX()+","+e.getY()+")");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		area.append("\n��갴�£�λ�ã�"+"("+e.getX()+","+e.getY()+")");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		area.append("\n����ͷţ�λ�ã�"+"("+e.getX()+","+e.getY()+")");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof JButton) {
			area.append("\n�����밴ť��λ�ã�"+"("+e.getX()+","+e.getY()+")");
		}
		if(e.getSource() instanceof JTextField) {
			area.append("\n�������ı���λ�ã�"+"("+e.getX()+","+e.getY()+")");
		}
		if(e.getSource() instanceof JFrame) {
			area.append("\n�����봰�ڣ�λ�ã�"+"("+e.getX()+","+e.getY()+")");
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		area.append("\n�����˳���λ�ã�"+"("+e.getX()+","+e.getY()+")");
	}
	
}
