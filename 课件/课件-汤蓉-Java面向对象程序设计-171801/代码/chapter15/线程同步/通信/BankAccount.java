package 线程同步.通信;

public class BankAccount {
	private int balance = 0;	//银行余额
	private boolean haveMoney = false;
	
	synchronized void deposit(int money){	//存款方法
		//如果账号有钱，及：haveMoney为true，则等待。
		if(haveMoney){	
			try{
				wait();
			}catch(InterruptedException e){	}
		}
		
		//如果账号没有钱，则存款。
		balance = balance + money;
		System.out.println("存入"+money+"元，账上余额为："+balance);
		haveMoney = true;	//取款后改变条件，使得其它线程有机会满足条件操作共享数据。
		notify();	//释放数据锁，唤醒其它等待操作共享数据的线程		
	}
	
	synchronized int withdraw(int money){	//取款方法，返回实践取走的金额
		//如果账号没有余额，则等待。
		if(!haveMoney){	
			try{
				wait();
			}catch(InterruptedException e){	}
		}
		
		//如果账号有余额，即：haveMoney为true，则取款
		if(balance > money){
			balance = balance - money;			
		}else {
			money = balance;	//余额不够时，取走余额。
			balance = 0;
		}		
		System.out.println("取出"+money+"元，账上余额为："+balance);
		haveMoney = false;	//取款后改变条件，使得其它线程有机会满足条件操作共享数据。
		notify();	//释放数据锁，唤醒其它等待操作共享数据的线程
		
		return money;
	}
}
