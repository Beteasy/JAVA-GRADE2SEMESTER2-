package shiyan2;

import java.awt.FlowLayout;
import java.io.File;

import javax.swing.*;

public class SearchWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	JTextField height;
	JTextField name;
	JLabel heightLabel;
	JLabel nameLabel;
	JButton searchButton;
	StudentListener listener;
	
	public void setHeight(JTextField height) {
		this.height = height;
	}
	
	public void setName(JTextField name) {
		this.name = name;
	}
	
	public SearchWindow() {
		init();
		this.setBounds(200, 200, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("学生信息查询");
		this.setVisible(true);
		
	}
	
	void init() {
		//三个列型盒式容器
		Box boxBase_V, boxV1, boxV2;
		//两个行型盒式容器
		Box boxH1, boxH2;

		boxBase_V = Box.createVerticalBox();
		boxV1 = Box.createVerticalBox();
		boxV2 = Box.createVerticalBox();
		boxH1 = Box.createHorizontalBox();
		boxH2 = Box.createHorizontalBox();
		
		
		
		//设置布局为FlowLayout
		this.setLayout(new FlowLayout());

		//第一个列型盒式容器布局
		boxV1.add(Box.createVerticalStrut(15));
		heightLabel = new JLabel("身高");
		boxV1.add(heightLabel);
		boxV1.add(Box.createVerticalStrut(15));
		nameLabel = new JLabel("姓名");
		boxV1.add(nameLabel);
		
		//第二个列型盒式容器布局
		boxV2.add(Box.createVerticalStrut(15));
		height = new JTextField(10);
		boxV2.add(height);
		boxV2.add(Box.createVerticalStrut(15));
		name = new JTextField(10);
		name.setEditable(false);
		boxV2.add(name);
		
		//第一个行型盒式容器布局
		boxH1.add(boxV1);
		boxH1.add(Box.createHorizontalStrut(25));
		boxH1.add(boxV2);
		
		//第二个行型盒式容器
		searchButton = new JButton("查询");
		boxH2.add(searchButton);
		
		//创建监听器
		listener = new StudentListener();
		listener.setHeightText(height);
		listener.setNameText(name);
		searchButton.addActionListener(listener);
		
		//第三个列型盒式容器
		boxBase_V.add(boxH1);
		boxBase_V.add(Box.createVerticalStrut(15));
		boxBase_V.add(boxH2);
		
		this.add(boxBase_V);
		
	}
	

}
