package shiyan2;

import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class StudentListener implements ActionListener{

	JTextField heightText;
	JTextField nameText;
	HashMap<String,String> hashMap;
	File file = new File("Student.txt");
	Scanner scan = null;
	
	/*
	 * ���������췽��
	 * ���ı��е����ݶ�ȡ��ɢ��ӳ���д���������ڲ�ѯ
	 */
	StudentListener(){
		try {
			hashMap = new HashMap<String,String>();
			//ʹ��scanner������ı�����
			scan = new Scanner(file);
			while(scan.hasNext()) {
				String name = scan.next();
				String height = scan.next();
				hashMap.put(height, name);
			}
		}
		catch(Exception e) {
			
		}
	}
	
	public void setHeightText(JTextField heightText) {
		this.heightText = heightText;
	}
	
	public void setNameText(JTextField nameText) {
		this.nameText = nameText;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//��ѯ
		if(e.getActionCommand().equals("��ѯ"))
		{
			String height = heightText.getText();
			if(hashMap.containsKey(height)) {
				String name = hashMap.get(height);
				nameText.setText(name);
			}
			else {
				nameText.setText("δ���ҵ���Ӧѧ��");
			}
		}
		
	}

}
