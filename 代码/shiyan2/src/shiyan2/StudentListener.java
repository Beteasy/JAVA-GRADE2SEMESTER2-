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
	 * 监视器构造方法
	 * 将文本中的数据读取到散列映射中存放起来用于查询
	 */
	StudentListener(){
		try {
			hashMap = new HashMap<String,String>();
			//使用scanner类解析文本数据
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
		//查询
		if(e.getActionCommand().equals("查询"))
		{
			String height = heightText.getText();
			if(hashMap.containsKey(height)) {
				String name = hashMap.get(height);
				nameText.setText(name);
			}
			else {
				nameText.setText("未查找到对应学生");
			}
		}
		
	}

}
