package fileAndDir;
import java.io.*;
public class FileAndDir {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//�����ļ���
		File file1 = new File("FileTest");//����File����
		file1.mkdir();	//ͨ��File���󴴽��ļ���
		
		//��Ŀ¼�д����ļ�
		File file2 = new File(file1, "test.txt");	//����File����
		file2.createNewFile();
		
		String arr[] = file1.list();
		System.out.println(arr[0]);
	}

}
