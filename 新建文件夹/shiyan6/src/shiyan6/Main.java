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
				buf_writer.write(s+"�ܳɼ�:"+sum);
				System.out.println(s+"�ܳɼ�:"+sum+"\n");
			}
			buf_reader.close();
			buf_writer.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void createFile(String fileName) {
		//��дcreateFile������ʹ��File�࣬��ָ��·���´���scoreAnalysis.txt�ļ�
		try {
			File file = new File(fileName);
			file.createNewFile();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		};
	}
	
	public static double getTotalScore(String s) {
		//��дgetTotalScore������ʹ��String��split����(������ʽ)�ֽ�����ÿһ���ַ�������������ܳɼ�
		String regex = "\\D+";
		String digitWord[] = s.split(regex);
		double sum = 0;
		for(int i=1; i<digitWord.length; i++) {
			sum += Double.parseDouble(digitWord[i]);
		}
		return sum;
	}

}
