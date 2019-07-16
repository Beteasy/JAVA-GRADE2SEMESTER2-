package ch_10_10_4;

import java.awt.*;

import javax.swing.*;

public class Example10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindGrid win = new WindGrid();
		win.setVisible(true);
		win.setBounds(100,100,300,300);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class WindGrid extends JFrame{
	GridLayout gird;
	JPanel chessboard;
	
	WindGrid(){
		chessboard = new JPanel();
		gird = new GridLayout(12,12);
		chessboard.setLayout(gird);
		Label label[][] = new Label[12][12];
		for(int i=0; i<12; i++) {
			for(int j=0; j<12; j++) {
				label[i][j] = new Label();
				if((i+j)%2 == 0){
					label[i][j].setBackground(Color.black);
				}
				else {
					label[i][j].setBackground(Color.white);
				}
				chessboard.add(label[i][j]);
			}
		}
		add(chessboard,BorderLayout.CENTER);
		add(new JButton("北方参战者"),BorderLayout.NORTH);
	}
}