package ch10_10_7;

import java.awt.event.*;

import javax.swing.*;


//�������̳�ActionListener�ӿ�
public class PoliceListen implements ActionListener{
	
	JTextField text;
	public void setJTextField(JTextField text) {
		this.text = text;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//��дactionPerformed���������ڴ����¼�
		// TODO Auto-generated method stub
		int n=0, m=0;
		
		//ActionEvent�¼�����getSource������ȡactionEvent�¼����¼�Դ���������
		//���������������ı���
		JTextField textSource = (JTextField)e.getSource();
		String str = textSource.getText();
		
		if(!str.isEmpty()) {
			try {
				//�ı�����յ�����һ���ַ������轫��ת��Ϊ����
				//���ܳ���ת���쳣��������Ҫ�쳣�������
				n = Integer.parseInt(str);
				m = n*n;
				text.setText(""+m);
			}
			catch(Exception ee) {
				textSource.setText("����������");
			}
		}
		
	}
	

}
