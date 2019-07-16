package shiyan6;

import java.io.*;

public class Main {
	
	public static void main(String args[]) {
		double sum=0;
		createFile("scoreAnalysis.txt");
		try {
			File file = new File("score.txt");
			File file2 = new File("scoreAnalysis.txt");
			FileReader filereader = new FileReader(file);
			FileWriter filewriter = new FileWriter(file2);
			BufferedReader buf_reader = new BufferedReader(filereader);
			BufferedWriter buf_writer = new BufferedWriter(filewriter);
			String s = null;
			while((s=buf_reader.readLine())!=null) {
				sum = getTotalScore(s);
				System.out.println(s);
				buf_writer.write(s+"总成绩:"+sum);
				System.out.println(s+"总成绩:"+sum+"\n");
			}
			buf_reader.close();
			buf_writer.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void createFile(String fileName) {
		//编写createFile方法，使用File类，在指定路径下创建scoreAnalysis.txt文件
		try {
			File file = new File(fileName);
			file.createNewFile();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		};
	}
	
	public static double getTotalScore(String s) {
		//编写getTotalScore方法，使用String的split方法(正则表达式)分解读入的每一行字符串，并计算出总成绩
		String regex = "\\D+";
		String digitWord[] = s.split(regex);
		double sum = 0;
		for(int i=1; i<digitWord.length; i++) {
			sum += Double.parseDouble(digitWord[i]);
		}
		return sum;
	}

}
