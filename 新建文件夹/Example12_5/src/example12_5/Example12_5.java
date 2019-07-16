package example12_5;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example12_5 {
	public static void main(String[] args)
	{
			byte b[] = "ÄãºÃ½üÀ´Ã¦Âð".getBytes();
			try {
				FileOutputStream out = new FileOutputStream("hello.txt",true);
				//out.write(b);
				out.write(b, 0, b.length);
				out.close();
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
	}

}
