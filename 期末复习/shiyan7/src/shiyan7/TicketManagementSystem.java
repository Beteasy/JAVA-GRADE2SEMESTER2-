package shiyan7;

public class TicketManagementSystem {
	public static void main(String[] args) {
		Ticket tickets = new Ticket(4,4);
		ReturnTicketThread reThread = new ReturnTicketThread(tickets);
		SellTicketThread seThread = new SellTicketThread(tickets);
		Thread rth = new Thread(reThread);
		Thread sth = new Thread(seThread);
		sth.start();
		rth.start();
	}
}
