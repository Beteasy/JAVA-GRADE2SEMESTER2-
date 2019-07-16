package createFile;
import java.io.*;
public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
