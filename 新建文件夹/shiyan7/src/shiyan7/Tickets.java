/*package shiyan7;

public class Tickets {
	int rows;			//票的总行数
	int columns; 		//票的总列数
	int total;			//总票数=行数*列数
	int freeSeatNum;	//余票数量
	boolean isSelling;	//true表示正在售票;不售票时为false，则表示可以退票
	
	public Tickets(int rows, int columns) {
		//构造方法
		this.rows = rows;
		this.columns = columns;
		total = this.rows*this.columns;
		freeSeatNum = this.total;
		if(freeSeatNum > 0) {
			isSelling = true;
		}
		else {
			isSelling = false;
		}
	}
	
	//售票方法：售出num张票
	synchronized public void sellTicket(int num) {
		System.out.println("售前余票:"+freeSeatNum+"；想购票数:"+num);
		if(!isSelling) {
			//退票中，则需等待退票
			
			try {
				//System.out.println("售前余票:"+freeSeatNum+"；想购票数:"+num);
				System.out.println("退票中，SellTicketThread Waiting...\n");
				wait();
			}
			catch(InterruptedException e) {}
		}
		else {
			//如果没在退票，则售票
			freeSeatNum -= num;
			System.out.println("购买了"+num+"张票");
			System.out.println("售后余票；"+freeSeatNum+"\n");
			isSelling = false;		//售票后改变条件，使得其它线程有机会操作共享数据
		}
		notify();				//释放数据锁，唤醒其它等待操作共享数据的线程
	}
	
	//退票方法：退回num张票
	synchronized public void returnTicket(int num) {
		if(isSelling) {
			//如果在售票，则退票等待
			
			try {
				System.out.println("售票中，ReturnTicketThread Waiting...");
				wait();
			}
			catch(InterruptedException e) {}
		}
		else {
			//如果没有在售票，则退票
			freeSeatNum += num;
			System.out.println("退了"+num+"张票");
			System.out.println("退票后余票:"+freeSeatNum+"\n");
			isSelling = true;
		}
		notify();
	}
}*/
package shiyan7;

public class Tickets {
	int rows;			//票的总行数
	int columns; 		//票的总列数
	int total;			//总票数=行数*列数
	int freeSeatNum;	//余票数量
	boolean isSelling;	//true表示正在售票;不售票时为false，则表示可以退票
	
	public Tickets(int rows, int columns) {
		//构造方法
		this.rows = rows;
		this.columns = columns;
		total = this.rows*this.columns;
		freeSeatNum = this.total;
		if(freeSeatNum > 0) {
			isSelling = true;
		}
		else {
			isSelling = false;
		}
	}
	
	//售票方法：售出num张票
	synchronized public void sellTicket(int num) {
		System.out.println("售前余票:"+freeSeatNum+"；想购票数:"+num);
		/*if(!isSelling)*/while(!isSelling) {		//此处为while
			//退票中，则需等待退票
			try {
				System.out.println("退票中，SellTicketThread Waiting...\n");
				wait();
			}
			catch(InterruptedException e) {}
		}
		
		//票数为0或小于所需订购票数--未考虑到
		if(freeSeatNum == 0 || freeSeatNum < num) {
			System.out.println("Tickets sold out or not enough tickets!");
			try {
				System.out.println("SellTicketThread Waiting.........");
				wait();
			}
			catch(InterruptedException e) {}
		}
		
		//如果没在退票，则售票
		if(freeSeatNum >= num) {
			freeSeatNum -= num;
			System.out.println("购买了"+num+"张票");
			System.out.println("售后余票；"+freeSeatNum+"\n");
		}
		isSelling = false;		//售票后改变条件，使得其它线程有机会操作共享数据
		notify();				//释放数据锁，唤醒其它等待操作共享数据的线程
	}
	
	//退票方法：退回num张票
	synchronized public void returnTicket(int num) {
		while(isSelling) {
			//如果在售票，则退票等待
			try {
				System.out.println("售票中，ReturnTicketThread Waiting...");
				wait();
			}
			catch(InterruptedException e) {}
		}
		
		//没有票被售出或退票数大于售出票数票，则不能办理退票
		if(freeSeatNum == total || num > total-freeSeatNum) {
			System.out.println("没有票被售出或退票数大于售出票数，不能退票!");	
			System.out.println();
			
			isSelling = true;
			notify();	
		}
		//如果没有在售票，则退票
		else {
			freeSeatNum += num;
			System.out.println("退了"+num+"张票");
			System.out.println("退票后余票:"+freeSeatNum+"\n");
			isSelling = true;
			notify();
		}

	}
}
