package ch10_10_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class WindowMenu extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenuBar menubar;
	JMenu menu,subMenu,menu2;
	JMenuItem item1, item2,item3,subitem1, subitem2, subitem3;
	
	public WindowMenu() {};
	
	public WindowMenu(String s, int x, int y, int w, int h) {
		init(s);
		this.setLocation(x, y);
		this.setSize(w, h);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@SuppressWarnings("deprecation")
	void init(String s) {
		this.setTitle(s);
		menubar = new JMenuBar();
		menu = new JMenu("菜单");
		menu2 =new JMenu("编辑");
		subMenu = new JMenu("子菜单");
		item1 = new JMenuItem("菜单项1");
		item2 = new JMenuItem("菜单项2");
		item1.setAccelerator(KeyStroke.getKeyStroke('A'));
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
		item3 = new JMenuItem("菜单项3");
		subitem1 = new JMenuItem("子菜单1");
		subitem2 = new JMenuItem("子菜单2");
		subitem3 = new JMenuItem("子菜单3");
		
		menu.add(item1);
		menu.addSeparator();
		menu.add(item2);
		menu2.add(item3);
		menu.add(subMenu);
		subMenu.add(subitem1);
		subMenu.add(subitem2);
		subMenu.add(subitem3);
		menubar.add(menu);
		menubar.add(menu2);
		this.setJMenuBar(menubar);
	}

}
