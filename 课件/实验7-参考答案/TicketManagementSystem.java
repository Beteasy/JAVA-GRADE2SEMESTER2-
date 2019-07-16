package Thread;

import java.io.*;

public class TicketManagementSystem {
	
	//��������������������Ʊ
	static public Ticket produceTickets(){				
		int rows = 0;		//����
		int columns = 0;	//����
		
		try{
			byte[] in = new byte[10];
			System.out.println("������������");
 			System.in.read(in);		//�Ӽ��̶�������
 			rows = Integer.parseInt(new String(in,0,1));	//�������ֽ�ת����int
 			
 			System.out.println("������������");
 			System.in.read(in);
 			columns = Integer.parseInt(new String(in,0,1));	
 		}catch(IOException ie){}
						
 		//����Ʊ
 		Ticket tickets = new Ticket(rows, columns);
		
		return tickets;
	}

	public static void main(String[] args) {
		// ����Ʊ
		Ticket tickets = produceTickets();		
		
		new Thread(new sellTicketThread(tickets)).start();
		new Thread(new returnTicketThread(tickets)).start();
	}
}
