package Thread;

public class returnTicketThread implements Runnable {
		Ticket tickets;
				
		public returnTicketThread(){}
		
		public returnTicketThread(Ticket tickets){
			this.tickets = tickets;
		}
				
		public void run(){
			int num = 2;	//ÿ����Ʊ����
			for(int i=0; i<3; i++){
				tickets.returnTicket(num);			
			}
		}
}
