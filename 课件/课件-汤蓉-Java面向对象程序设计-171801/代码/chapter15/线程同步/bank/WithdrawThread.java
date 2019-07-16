package 线程同步.bank;

//取款线程
public class WithdrawThread implements Runnable {
	private BankAccount account;	//取钱的BankAccount对象
	
	public WithdrawThread(BankAccount account) {
		super();
		this.account = account;
	}
	
	public void run(){
		for(int i=0; i<4; i++){
			account.withdraw(100);
		}
	}	
}
