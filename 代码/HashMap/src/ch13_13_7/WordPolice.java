package ch13_13_7;

import java.awt.event.*;
import java.io.File;
import java.util.*;

import javax.swing.*;

public class WordPolice implements ActionListener{

	JTextField showText;
	HashMap<String,String> hashmap;
	File file = new File("E:\\JAVA\\代码\\HashMap\\Word.txt");
	Scanner sc = null;
	
	WordPolice(){
		hashmap = new HashMap<String,String>();
		try {
			sc = new Scanner(file);
			while(sc.hasNext()) {
				String englishWord = sc.next();
				
				String chineseWord = sc.next();
				hashmap.put(englishWord, chineseWord);
				
			}
		}
		catch(Exception e) {}
	}
	
	public void setJTextField(JTextField showText) {
		this.showText = showText;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String englishWord = e.getActionCommand();	//???
		if(hashmap.containsKey(englishWord)) {
			String chineseWord = hashmap.get(englishWord);
			showText.setText(chineseWord);
		}
		else {
			showText.setText("没有此单词");
		}
	}

	
}
