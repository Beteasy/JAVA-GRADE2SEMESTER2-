package xample15_ppt;

public class DepositThread implements Runnable{
	
	//һ����Ķ�����Ϊ��һ����ĳ�Ա����
	private BankAccount account;	//����BankAccount����
	
	public DepositThread(BankAccount account) {
		super();
		this.account = account;
	}
	
	public void run() {
		for(int i=0; i<5; i++)
		account.deposit(100);
	}
}
