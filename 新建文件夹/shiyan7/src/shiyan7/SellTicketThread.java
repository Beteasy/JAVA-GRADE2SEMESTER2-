package shiyan7;

public class SellTicketThread implements Runnable{
	private Tickets ticket;  //售票的ticket对象
	
	public SellTicketThread(Tickets ticket) {
		super();
		this.ticket = ticket;
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			ticket.sellTicket(3);
			
			/*if(tickets.isSoldOut())
				break;*/  //未考虑到票卖完的情况
		}
	}
}
