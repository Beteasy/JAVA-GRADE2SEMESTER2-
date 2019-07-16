package shiyan7;

public class ReturnTicketThread implements Runnable{
	private Tickets ticket;		//退票的ticket对象
	
	public ReturnTicketThread(Tickets ticket) {
		//构造方法
		super();
		this.ticket = ticket;
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			ticket.returnTicket(2);
		}
	}
}
