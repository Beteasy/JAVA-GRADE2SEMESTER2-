package xample15_ppt;

public class DepositThread implements Runnable{
	
	//一个类的对象作为另一个类的成员变量
	private BankAccount account;	//存款的BankAccount对象
	
	public DepositThread(BankAccount account) {
		super();
		this.account = account;
	}
	
	public void run() {
		for(int i=0; i<5; i++)
		account.deposit(100);
	}
}
