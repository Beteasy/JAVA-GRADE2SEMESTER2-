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
		this.setTitle("ѧ����Ϣ��ѯ");
		this.setVisible(true);
		
	}
	
	void init() {
		//�������ͺ�ʽ����
		Box boxBase_V, boxV1, boxV2;
		//�������ͺ�ʽ����
		Box boxH1, boxH2;

		boxBase_V = Box.createVerticalBox();
		boxV1 = Box.createVerticalBox();
		boxV2 = Box.createVerticalBox();
		boxH1 = Box.createHorizontalBox();
		boxH2 = Box.createHorizontalBox();
		
		
		
		//���ò���ΪFlowLayout
		this.setLayout(new FlowLayout());

		//��һ�����ͺ�ʽ��������
		boxV1.add(Box.createVerticalStrut(15));
		heightLabel = new JLabel("���");
		boxV1.add(heightLabel);
		boxV1.add(Box.createVerticalStrut(15));
		nameLabel = new JLabel("����");
		boxV1.add(nameLabel);
		
		//�ڶ������ͺ�ʽ��������
		boxV2.add(Box.createVerticalStrut(15));
		height = new JTextField(10);
		boxV2.add(height);
		boxV2.add(Box.createVerticalStrut(15));
		name = new JTextField(10);
		name.setEditable(false);
		boxV2.add(name);
		
		//��һ�����ͺ�ʽ��������
		boxH1.add(boxV1);
		boxH1.add(Box.createHorizontalStrut(25));
		boxH1.add(boxV2);
		
		//�ڶ������ͺ�ʽ����
		searchButton = new JButton("��ѯ");
		boxH2.add(searchButton);
		
		//����������
		listener = new StudentListener();
		listener.setHeightText(height);
		listener.setNameText(name);
		searchButton.addActionListener(listener);
		
		//���������ͺ�ʽ����
		boxBase_V.add(boxH1);
		boxBase_V.add(Box.createVerticalStrut(15));
		boxBase_V.add(boxH2);
		
		this.add(boxBase_V);
		
	}
	

}
