package shiyan7;

public class Ticket {
	int rows;
	int columns;
	int total;
	int freeSeatNum;
	boolean isSelling;
	
	public Ticket(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		total = rows*columns;
		freeSeatNum = total;
		isSelling = true;
		
		System.out.println("一共有"+freeSeatNum+"张票");
		System.out.println();
	}
	
	synchronized public void sellTicket(int num) {
		System.out.println("售票前余票："+freeSeatNum+"; 想购票数："+num);	
		while(!isSelling) {
			System.out.println("退票中，SellTicketThread Waiting...\n");
			try {
				wait();
			}
			catch(InterruptedException e) {}
		}
		if(num > freeSeatNum || freeSeatNum == 0) {
			System.out.println("Tickets sold out or not enough tickets!");
			//isSelling = false;
			try{
				System.out.println("SellTicketThread Waiting........");
				System.out.println();
				wait();					
			}catch(InterruptedException ie){}	
		}
		else {
			freeSeatNum -= num;
			System.out.println("购买了num张票");
			System.out.println("售票后余票："+freeSeatNum);
			System.out.println();
		}
		isSelling = false;
		notify();
	}
	
	synchronized public void returnTicket(int num) {
		while(isSelling) {
			System.out.println("售票中，ReturnTicketThread Waiting...");
			try {
				wait();
			}
			catch(InterruptedException e) {}
		}
		if(num>(total-freeSeatNum) || freeSeatNum == total) {
			System.out.println("没有票被售出或退票数大于售出票数，不能退票!");	
			System.out.println();
			isSelling = true;
			notify();
		}
		
		else {
			freeSeatNum += num;
			System.out.println("退了"+num+"张票");
			System.out.println("退票后余票"+freeSeatNum);
			isSelling = true;
			notify();
		}
		
	}
	//判断票是否还没开始卖
	boolean isFull(){
		if(freeSeatNum == rows * columns)
			return true;
		else 
			return false;
	}
	
	//判断票是否全部卖完
	boolean isSoldOut(){
		if(freeSeatNum==0)
			return true;
		else
			return false;
	}	
}
