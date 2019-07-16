package ʵ��6;

import java.io.*;
import java.util.*;

public class AnalysisResult {
	
	public static void createFile(String fileName){
		File outFile = new File(fileName);
		try{
			if(!outFile.exists()){
				outFile.createNewFile();
			}
		}catch(IOException e){}			
	}
	
	public static double getTotalScore(String s){
		String regex="\\D+" ; 				//ƥ������ֵ�������ʽ
		String[] numbers = s.split(regex);
		//System.out.println(Arrays.toString(numbers));
		
		double totalScore = 0.0;
		for(int j=0; j<numbers.length;j++){
			if(!numbers[j].equals("")){
				totalScore += Double.parseDouble(numbers[j]);
			}
		}		
		
		//System.out.println(totalScore);
		return totalScore;
	}	
	
	public static void main(String args[]) {		
      File fRead = new File("D:\\Java\\lab6\\score.txt");  
      
      //��������ļ�
      String fileName = "D:\\Java\\lab6\\socreAnalysis.txt";
      createFile(fileName);
            
      try{   
    	  Reader in = new FileReader(fRead);						//����ָ���ļ�fRead��in��
          BufferedReader bufferRead = new BufferedReader(in);		//����ָ��in��bufferRead��
          
          Writer out = new FileWriter(fileName);					//��β�ӷ�ʽ����ָ���ļ�fWrite��out��
          BufferedWriter bufferWrite = new BufferedWriter(out);		//����ָ��out��bufferWrite��
            
          String str = null;
          while((str=bufferRead.readLine())!=null) {
        	  System.out.println(str);
        	  
              double totalScore = getTotalScore(str);
              str = str+"�ܳɼ�:"+totalScore; 
              System.out.println(str+"\n");
              
              bufferWrite.write(str);              
              bufferWrite.newLine();
          }
          
          bufferRead.close();
          bufferWrite.close(); 
      }catch(IOException e) {
          System.out.println(e.toString());
      }
   }
}