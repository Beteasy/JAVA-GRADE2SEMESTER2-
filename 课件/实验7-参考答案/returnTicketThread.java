package Thread;

public class returnTicketThread implements Runnable {
		Ticket tickets;
				
		public returnTicketThread(){}
		
		public returnTicketThread(Ticket tickets){
			this.tickets = tickets;
		}
				
		public void run(){
			int num = 2;	//每次退票数量
			for(int i=0; i<3; i++){
				tickets.returnTicket(num);			
			}
		}
}
