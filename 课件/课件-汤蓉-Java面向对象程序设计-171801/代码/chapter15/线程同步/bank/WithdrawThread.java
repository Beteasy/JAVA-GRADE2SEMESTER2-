package �߳�ͬ��.bank;

//ȡ���߳�
public class WithdrawThread implements Runnable {
	private BankAccount account;	//ȡǮ��BankAccount����
	
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
