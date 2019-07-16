package example12_3;
import java.io.*;
public class Example12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Runtime ec = Runtime.getRuntime();
			File file = new File("G:\\iNode","HtDown.exe");
			ec.exec(file.getAbsolutePath());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
