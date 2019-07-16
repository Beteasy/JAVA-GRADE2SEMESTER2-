package shiyan6;

import java.io.*;

public class Shiyan6 {
	public static void main(String[] args) {
		double sum = 0.0;
		createFile("scoreAnalysis.txt");
		try {
			File score = new File("score.txt");
			File scoreAna = new File("scoreAnalysis.txt");
			FileReader freader = new FileReader(score);
			FileWriter fwriter = new FileWriter(scoreAna);
			BufferedReader bufreader = new BufferedReader(freader);
			BufferedWriter bufwriter = new BufferedWriter(fwriter);
			String str = null;
			while((str=bufreader.readLine())!=null) {
				sum = getTotalScore(str);
				System.out.println(str);
				System.out.println(str+"�ܳɼ�:"+sum);
				bufwriter.write(str+"�ܳɼ�:"+sum);
			}
			bufreader.close();
			bufwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void createFile(String fileName) {
		File file = new File(fileName);
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static double getTotalScore(String s) {
		String regex = "\\D+";
		String[] digit = s.split(regex);
		double sum = 0.0;
		for(int i=0;i<digit.length; i++) {
			if(!digit[i].equals("")) {
				sum += Double.parseDouble(digit[i]);
			}
		}
		return sum;
	}
}
