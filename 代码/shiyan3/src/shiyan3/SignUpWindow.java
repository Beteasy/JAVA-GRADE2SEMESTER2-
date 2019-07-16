package shiyan3;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SignUpWindow extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	JLabel label;
	JTextField usernameText;
	JPasswordField passwordField;
	JButton signUpButton;
	User user;
	DBUtil util = new DBUtil();
	UserDao userdao = new UserDao(util.getConnection());
	
	SignUpWindow(){
		init();
		this.setBounds(600, 300, 400, 300);
		this.setTitle("���û�ע��");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	void init(){
		this.setLayout(new FlowLayout());
		Box boxBase,boxV1,boxV2,boxV3,boxH1,boxH2;
		boxV1 = Box.createVerticalBox();
		boxV2 = Box.createVerticalBox();
		boxV3 = Box.createVerticalBox();
		boxBase = Box.createVerticalBox();
		boxH1 = Box.createHorizontalBox();
		boxH2 = Box.createHorizontalBox();
				
		boxV1.add(Box.createVerticalStrut(50));
		boxV1.add(new JLabel("�û���"));
		boxV1.add(Box.createVerticalStrut(50));
		boxV1.add(new JLabel("��    ��"));
				
		usernameText = new JTextField(15);
		usernameText.setText("�������û���");
		boxV2.add(Box.createVerticalStrut(50));
		boxV2.add(usernameText);
		passwordField = new JPasswordField(15);
		boxV2.add(Box.createVerticalStrut(50));
		boxV2.add(passwordField);

		//������ʾ�û�����ע��淶
		JLabel label = new JLabel();
		label.setFont(new Font("����",Font.BOLD,10));
		label.setText("<html><body>�û����ĳ���<br />������14</body></html>");
		boxV3.add(label);
		boxV3.add(Box.createVerticalStrut(25));
				
		//�����������ӵ�����
		boxH1.add(boxV1);
		boxH1.add(Box.createHorizontalStrut(8));
		boxH1.add(boxV2);
		boxH1.add(Box.createHorizontalStrut(8));
		boxH1.add(boxV3);
				
		//���ע�ᰴť
		signUpButton = new JButton("ע��");
		boxH2.add(signUpButton);
		
		boxBase.add(boxH1);
		boxBase.add(Box.createVerticalStrut(40));
		boxBase.add(boxH2);
		
		this.add(boxBase);
		
		//��ӽ����¼�������
		MyFocusListener myFocusListener = new MyFocusListener();
		myFocusListener.setUsernameText(usernameText);
		myFocusListener.setLabel(label);
		usernameText.addFocusListener(myFocusListener);
		
		//���ע���¼�������
		signUpButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//����û����ĳ��ȴ���14����������ʾ
		if(usernameText.getText().length()>14) {
			label.setForeground(Color.RED);
			label.setText("<html><body>�û�������<br />���ܳ���14<br />����������</body></html>");
		}
		
		//���û���������Ϊ��ʱ�������ڽ��о���
		else if(usernameText.getText().length()==0 || passwordField.getPassword().length==0) {
			JOptionPane.showMessageDialog(null, "�û��������벻Ϊ��", "����", JOptionPane.WARNING_MESSAGE);
		}
		
		/*
		 * �û������������Ҫ��
		 * ���û�ע����Ϣд�����ݿ�
		 * �������ڽ�����ʾ
		 */
		else {
			user = new User();
			user.setUsername(usernameText.getText());
			user.setPassword(String.copyValueOf(passwordField.getPassword()));
			boolean flag = userdao.add(user);
			if(flag) {
				//ע��ɹ�
				String message = "ע��ɹ�\n�û���Ϊ:"+usernameText.getText()+"\n����Ϊ:"+String.valueOf(passwordField.getPassword());
				JOptionPane.showMessageDialog(null, message, "ע��ɹ�", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				//�û��Ѵ��ڣ�ע��ʧ��
				String message = "ע��ʧ��\n�û�:"+usernameText.getText()+"�Ѵ���";
				JOptionPane.showMessageDialog(null, message, "ע��ʧ��", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
	}
}
