package fileAndDir;
import java.io.*;
public class FileAndDir {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//创建文件夹
		File file1 = new File("FileTest");//创建File对象
		file1.mkdir();	//通过File对象创建文件夹
		
		//在目录中创建文件
		File file2 = new File(file1, "test.txt");	//创建File对象
		file2.createNewFile();
		
		String arr[] = file1.list();
		System.out.println(arr[0]);
	}

}
