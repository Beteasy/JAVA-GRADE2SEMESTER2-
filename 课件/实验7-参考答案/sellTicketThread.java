package Thread;

public class sellTicketThread implements Runnable {
	Ticket tickets;
		
	public sellTicketThread(){}
	
	public sellTicketThread(Ticket tickets){
		this.tickets = tickets;
	}	
		
	public void run(){		
		int num = 3;	//ÊÛÆ±ÊıÁ¿
		for(int i=0; i<3; i++){
			tickets.sellTicket(num);
			if(tickets.isSoldOut())
				break;
		}
	}
}
