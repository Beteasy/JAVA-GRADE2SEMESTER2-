package shiyan7;

public class ReturnTicketThread implements Runnable {
	Ticket tickets;
	int num = 2;
	
	public ReturnTicketThread(Ticket tickets) {
		this.tickets = tickets;
	}
	
	public ReturnTicketThread() {}
	
	public void run() {
		for(int i=0;i<3; i++) {
			tickets.sellTicket(num);
		}
	}
}
