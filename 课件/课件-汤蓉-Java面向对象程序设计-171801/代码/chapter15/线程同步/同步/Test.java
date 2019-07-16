package 线程同步.同步;

public class Test {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		Thread dt = new Thread(new DepositThread(account));
		Thread wt = new Thread(new WithdrawThread(account));
		
		dt.start();
		wt.start();
	}
}
