package 线程同步.通信;

//存款线程
public class DepositThread implements Runnable {
	private BankAccount account;	//存款的BankAccount对象
	
	public DepositThread(BankAccount account) {
		super();
		this.account = account;
	}
	
	public void run(){
		for(int i=0; i<5; i++){
			account.deposit(100);
		}
	}	
}
