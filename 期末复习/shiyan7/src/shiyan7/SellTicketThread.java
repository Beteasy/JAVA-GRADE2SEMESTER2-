package shiyan7;

public class SellTicketThread implements Runnable{
	Ticket tickets;
	int num=3;
	
	public SellTicketThread() {}
	
	public SellTicketThread(Ticket tickets) {
		this.tickets = tickets;
	}
	
	public void run() {
		for(int i=0; i<3; i++) {
			tickets.sellTicket(num);
			if(tickets.isSoldOut())
				break;
		}
	}
}
