package ch10_10_6;

import java.awt.event.*;

//�������̳�ActionListener�ӿ�
public class PoliceListen implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//��дactionPerformed���������ڴ����¼�
		// TODO Auto-generated method stub
		int n=0, m=0;
		String str = e.getActionCommand();
		try {
			//�ı�����յ�����һ���ַ������轫��ת��Ϊ����
			//���ܳ���ת���쳣��������Ҫ�쳣�������
			n = Integer.parseInt(str);
			m = n*n;
			System.out.println(n+"��ƽ����"+m);
		}
		catch(Exception ee) {
			System.out.println(e.toString());
		}
	}
	

}
