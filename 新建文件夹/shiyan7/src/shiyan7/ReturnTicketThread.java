package shiyan7;

public class ReturnTicketThread implements Runnable{
	private Tickets ticket;		//��Ʊ��ticket����
	
	public ReturnTicketThread(Tickets ticket) {
		//���췽��
		super();
		this.ticket = ticket;
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			ticket.returnTicket(2);
		}
	}
}
