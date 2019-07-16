package xample15_ppt;

public class WithDrawThread implements Runnable{
	private BankAccount account = new BankAccount();
	
	public WithDrawThread(BankAccount account) {
		super();
		this.account = account;
	}
	
	public void run() {
		for(int i=0; i<4; i++) {
			account.withdraw(100);
		}
	}
}
