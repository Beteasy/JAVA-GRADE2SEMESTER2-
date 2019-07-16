package xample15_ppt;

public class BankAccount {
	private int balance=0;	//�������
	private boolean haveMoney = false;
	
	synchronized void deposit(int money) {
		//����
		if(haveMoney) {
			try {
				wait();
			}
			catch(InterruptedException e) {}
		}
		balance += money;
		System.out.println("����"+money+"Ԫ���������Ϊ:"+balance);
		haveMoney = true;
		notify();
	}
	
	synchronized int withdraw(int money) {
		//ȡ���������ʵ��ȡ�ߵĽ��
		if(!haveMoney) {
			try {
				wait();
			}
			catch(InterruptedException e) {}
		}
		
		if(balance>money) {
			balance -= money;
		}
		else {
			money = balance;	//����ʱ��ȡ�����
			balance = 0;
		}
		System.out.println("ȡ��"+money+"Ԫ���������Ϊ:"+balance);
		haveMoney = false;
		notify();
		return money;
		
	}
}
