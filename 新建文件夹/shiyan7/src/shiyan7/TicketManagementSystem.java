package shiyan7;

import java.util.Scanner;

public class TicketManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		int columns;
		Scanner reader = new Scanner(System.in);
		System.out.println("����������:");
		rows = reader.nextInt();
		System.out.println("������������:");
		columns = reader.nextInt();
		reader.close();
		Tickets ticket = new Tickets(rows,columns);
		System.out.println("һ����"+ticket.total+"��Ʊ:\n");
		
		SellTicketThread sellticket = new SellTicketThread(ticket);
		ReturnTicketThread returnticket = new ReturnTicketThread(ticket);
		
		Thread st = new Thread(sellticket);
		Thread rt = new Thread(returnticket);
		
		st.start();
		rt.start();
	}

}
