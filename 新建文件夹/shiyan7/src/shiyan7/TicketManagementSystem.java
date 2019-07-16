package shiyan7;

import java.util.Scanner;

public class TicketManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		int columns;
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入行数:");
		rows = reader.nextInt();
		System.out.println("请输入行列数:");
		columns = reader.nextInt();
		reader.close();
		Tickets ticket = new Tickets(rows,columns);
		System.out.println("一共有"+ticket.total+"张票:\n");
		
		SellTicketThread sellticket = new SellTicketThread(ticket);
		ReturnTicketThread returnticket = new ReturnTicketThread(ticket);
		
		Thread st = new Thread(sellticket);
		Thread rt = new Thread(returnticket);
		
		st.start();
		rt.start();
	}

}
