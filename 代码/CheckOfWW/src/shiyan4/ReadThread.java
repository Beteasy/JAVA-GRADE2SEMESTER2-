package shiyan4;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Scanner;

public class ReadThread implements Runnable {
	
	
	Scanner scanner = new Scanner(System.in);	
	DataInputStream in;
	DataOutputStream out;
	
	public void setin(DataInputStream in) {
		this.in = in;
	}
	
	public void setout(DataOutputStream out) {
		this.out = out;
	}
	
	@Override
	public void run() {
		System.out.println("�����˵���");
		while(true) {								//�ǵ�
			
			
			String string = scanner.nextLine();
			try {
				out.writeUTF(string);
				string = in.readUTF();
				System.out.println(string);
				
			}
			catch(Exception e) {
				break;
			
			}
		
			
		
		}
		
		
		
	}
	

}
