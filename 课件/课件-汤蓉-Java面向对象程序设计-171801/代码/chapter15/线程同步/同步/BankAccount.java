package 线程同步.同步;

public class BankAccount {
	private int balance = 0;	//银行余额
		
	synchronized void deposit(int money){	//存款方法
		balance = balance + money;
		System.out.println("存入"+money+"元，账上余额为："+balance);		
	}
	
	synchronized int withdraw(int money){	//取款方法，返回实践取走的金额
		if(balance > money){
			balance = balance - money;			
		}else {
			money = balance;	//余额不够时，取走余额。
			balance = 0;
		}		
		System.out.println("取出"+money+"元，账上余额为："+balance);

		return money;
	}
}
