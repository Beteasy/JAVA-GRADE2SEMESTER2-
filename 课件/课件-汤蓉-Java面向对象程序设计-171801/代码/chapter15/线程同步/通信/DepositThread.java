package �߳�ͬ��.ͨ��;

//����߳�
public class DepositThread implements Runnable {
	private BankAccount account;	//����BankAccount����
	
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
