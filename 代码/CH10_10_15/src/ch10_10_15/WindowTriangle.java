package ch10_10_15;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

public class WindowTriangle extends JFrame implements ActionListener{
	
	Triangle triangle;	//model
	JTextField textA, textB, textC;		//view
	JTextArea showArea;		//view
	JButton controlButton;		//controller
	
	WindowTriangle(){
		init();
		this.setVisible(true);
		this.setBounds(100, 100, 420, 260);
		this.setTitle("使用MVC结构");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void init(){
		triangle = new Triangle();
		textA = new JTextField(5);
		textB = new JTextField(5);
		textC = new JTextField(5);
		showArea = new JTextArea();
		controlButton = new JButton("计算面积");
		
		//试试直接setLaout()
		JPanel pNorth = new JPanel();
		pNorth.add(new JLabel("边A："));
		pNorth.add(textA);
		pNorth.add(new JLabel("边B："));
		pNorth.add(textB);
		pNorth.add(new JLabel("边C："));
		pNorth.add(textC);
		pNorth.add(controlButton);
		pNorth.add(showArea);
		controlButton.addActionListener(this);
		this.add(pNorth,BorderLayout.NORTH);
		this.add(new JScrollPane(showArea),BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			double a = Double.parseDouble(textA.getText().trim());
			double b = Double.parseDouble(textB.getText().trim());
			double c = Double.parseDouble(textC.getText().trim());
			
			triangle.setA(a);
			triangle.setB(b);
			triangle.setC(c);
			String area = triangle.getArea();
			showArea.append("三角形"+a+","+b+","+c+"的面积：");
			showArea.append(area);
		}
		catch(Exception ee) {
			showArea.append("\n"+ee+"\n");
		}
		
	}

	
}
