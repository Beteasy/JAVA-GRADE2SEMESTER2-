package 实验6;

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
		String regex="\\D+" ; 				//匹配非数字的正则表达式
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
      
      //创建输出文件
      String fileName = "D:\\Java\\lab6\\socreAnalysis.txt";
      createFile(fileName);
            
      try{   
    	  Reader in = new FileReader(fRead);						//创建指向文件fRead的in流
          BufferedReader bufferRead = new BufferedReader(in);		//创建指向in的bufferRead流
          
          Writer out = new FileWriter(fileName);					//以尾加方式创建指向文件fWrite的out流
          BufferedWriter bufferWrite = new BufferedWriter(out);		//创建指向out的bufferWrite流
            
          String str = null;
          while((str=bufferRead.readLine())!=null) {
        	  System.out.println(str);
        	  
              double totalScore = getTotalScore(str);
              str = str+"总成绩:"+totalScore; 
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