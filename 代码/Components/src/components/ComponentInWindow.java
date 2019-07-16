package components;

import java.awt.*;

import javax.swing.*;

public class ComponentInWindow extends JFrame {
	
	JTextField text;
	JButton button;
	JCheckBox checkBox1, checkBox2, checkBox3;
	JRadioButton radio1, radio2;
	ButtonGroup group;
	JComboBox<String> comBox;
	JTextArea area;
	JPasswordField password;
	
	//public ComponentInWindow() {}
	
	public ComponentInWindow() {
		init();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void init() {
		//this.setLayout(new FlowLayout());
		JPanel panel = new JPanel();
		this.setContentPane(panel);
		JLabel biaoqian = new JLabel("文本框");
		panel.add(biaoqian);
		text = new JTextField(10);
		panel.add(text);
		button = new JButton("确定");
		panel.add(button);
		checkBox1 = new JCheckBox("喜欢音乐");
 		panel.add(checkBox1);
		checkBox2 = new JCheckBox("喜欢旅游");
		panel.add(checkBox2);
		checkBox3 = new JCheckBox("喜欢篮球");
		panel.add(checkBox3);
		group = new ButtonGroup();
		radio1 = new JRadioButton("帅哥");
		radio2 = new JRadioButton("美女");
		group.add(radio1);
		group.add(radio2);
		panel.add(radio1);
		panel.add(radio2);
		comBox = new JComboBox<String>();
		comBox.addItem("音乐天地");
		comBox.addItem("游戏天地");
		comBox.addItem("舞蹈天地");
		panel.add(comBox);
		area = new JTextArea(3,20);
		JScrollPane scroll = new JScrollPane(area);
		panel.add(scroll);
		password = new JPasswordField(15);
		password.setEchoChar('*');
		panel.add(password);
		char pass[] = password.getPassword();
	}
}
