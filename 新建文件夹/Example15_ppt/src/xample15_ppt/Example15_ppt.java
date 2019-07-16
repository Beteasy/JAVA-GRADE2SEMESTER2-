package xample15_ppt;

public class Example15_ppt {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		DepositThread deposit = new DepositThread(account);
		WithDrawThread withdraw = new WithDrawThread(account);
		
		Thread dt = new Thread(deposit);
		Thread wt = new Thread(withdraw);
		
		dt.start();
		wt.start();
	}
}
