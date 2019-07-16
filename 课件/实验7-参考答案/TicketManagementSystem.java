package Thread;

import java.io.*;

public class TicketManagementSystem {
	
	//读入行数和列数，产生票
	static public Ticket produceTickets(){				
		int rows = 0;		//行数
		int columns = 0;	//列数
		
		try{
			byte[] in = new byte[10];
			System.out.println("请输入行数：");
 			System.in.read(in);		//从键盘读入行数
 			rows = Integer.parseInt(new String(in,0,1));	//将读入字节转换成int
 			
 			System.out.println("请输入列数：");
 			System.in.read(in);
 			columns = Integer.parseInt(new String(in,0,1));	
 		}catch(IOException ie){}
						
 		//产生票
 		Ticket tickets = new Ticket(rows, columns);
		
		return tickets;
	}

	public static void main(String[] args) {
		// 产生票
		Ticket tickets = produceTickets();		
		
		new Thread(new sellTicketThread(tickets)).start();
		new Thread(new returnTicketThread(tickets)).start();
	}
}
