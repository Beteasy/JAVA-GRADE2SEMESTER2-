package �߳�ͬ��.bank;

public class BankAccount {
	private int balance;	//�������
	
	void deposit(int money){	//����
		balance = balance + money;
		System.out.println("����"+money+"Ԫ���������Ϊ��"+balance);
	}
	
	int withdraw(int money){	//ȡ���������ʵ��ȡ�ߵĽ��
		if(balance > money){
			balance = balance - money;
		}else {
			money = balance;	//����ʱ��ȡ����
			balance = 0;
		}		
		System.out.println("ȡ��"+money+"Ԫ���������Ϊ��"+balance);
		
		return money;
	}
}
