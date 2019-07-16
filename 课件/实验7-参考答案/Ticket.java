package Thread;

public class Ticket {
	int rows;					//票的总行数
	int columns;				//票的总列数	
	int total;					//总票数
	int freeSeatNum;			//余票数量
	boolean isSelling;			//true表示正在售票; false则表示可以退票
	
	public Ticket(){}
	
	public Ticket(int rows, int columns){
		this.rows = rows;
		this.columns = columns;
		isSelling = true;	
		
		freeSeatNum = rows * columns;
		total = rows * columns;
		
		System.out.println("一共有"+freeSeatNum+"张票");
		System.out.println();
	}
	
	//卖票方法
	synchronized public void sellTicket(int num){
		System.out.println("售票前余票："+freeSeatNum+"; 想购票数："+num);	
	
		//如果正在退票(false)，则等待
		while(!isSelling){
			try{
				System.out.println("退票中，SellTicketThread Waiting...");
				System.out.println();
				wait();					
			}catch(InterruptedException ie){}
		}	
		
		//余票数为0或小于所需订购票数
		if(freeSeatNum == 0 || freeSeatNum < num){
			System.out.println("Tickets sold out or not enough tickets!");
			try{
				System.out.println("SellTicketThread Waiting........");
				System.out.println();
				wait();					
			}catch(InterruptedException ie){}			
		}
		
		//正常售票	
		if(freeSeatNum >= num){		
			freeSeatNum = freeSeatNum - num;
			
			System.out.println("购买了"+num+"张票");	
			System.out.println("售票后余票："+freeSeatNum);	
			System.out.println();
		}	
		
		isSelling = false;
		notify();
	}
	
	//退票
	synchronized public void returnTicket(int num){
		
		//如果买票线程正在买票(true)，则等待
		while(isSelling){
			try{
				System.out.println("售票中，ReturnTicketThread Waiting...");
				wait();		
			}catch(InterruptedException ie){}
		}
		
		//没有票被售出或退票数大于售出票数票，则不能办理退票
		if(freeSeatNum == total || num > (total-freeSeatNum)){
			System.out.println("没有票被售出或退票数大于售出票数，不能退票!");	
			System.out.println();
			
			isSelling = true;
			notify();	
		}else {//正常退票操作
			freeSeatNum = freeSeatNum + num;
			
			System.out.println("退了"+num+"张票");	
			System.out.println("退票后余票："+freeSeatNum);	
			System.out.println();
			
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
