import java.io.*;

public class ClientThread implements Runnable{

	DataInputStream in = null;
	DataOutputStream out = null;
	
	public void setDataInputStream(DataInputStream in) {
		this.in = in;
	}
	
	public void setDataOutputStream(DataOutputStream out) {
		this.out = out;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		String str = new String("");
		while(i<3) {
			try {
				out.writeUTF("Client Message"+i);
				System.out.println("客户端发送:Client Message"+i);
				i++;
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				str = in.readUTF();
				System.out.println("客户收到:"+str);
				System.out.println();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("服务器断开连接");
			}
			
		}
		//
	}
}
