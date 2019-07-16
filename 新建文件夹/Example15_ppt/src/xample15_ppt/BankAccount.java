package xample15_ppt;

public class BankAccount {
	private int balance=0;	//银行余额
	private boolean haveMoney = false;
	
	synchronized void deposit(int money) {
		//存款方法
		if(haveMoney) {
			try {
				wait();
			}
			catch(InterruptedException e) {}
		}
		balance += money;
		System.out.println("存入"+money+"元，账上余额为:"+balance);
		haveMoney = true;
		notify();
	}
	
	synchronized int withdraw(int money) {
		//取款方法，返回实际取走的金额
		if(!haveMoney) {
			try {
				wait();
			}
			catch(InterruptedException e) {}
		}
		
		if(balance>money) {
			balance -= money;
		}
		else {
			money = balance;	//余额不够时，取走余额
			balance = 0;
		}
		System.out.println("取走"+money+"元，账上余额为:"+balance);
		haveMoney = false;
		notify();
		return money;
		
	}
}
