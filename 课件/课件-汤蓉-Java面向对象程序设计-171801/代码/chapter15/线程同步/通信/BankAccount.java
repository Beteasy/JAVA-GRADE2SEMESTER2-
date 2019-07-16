package �߳�ͬ��.ͨ��;

public class BankAccount {
	private int balance = 0;	//�������
	private boolean haveMoney = false;
	
	synchronized void deposit(int money){	//����
		//����˺���Ǯ������haveMoneyΪtrue����ȴ���
		if(haveMoney){	
			try{
				wait();
			}catch(InterruptedException e){	}
		}
		
		//����˺�û��Ǯ�����
		balance = balance + money;
		System.out.println("����"+money+"Ԫ���������Ϊ��"+balance);
		haveMoney = true;	//ȡ���ı�������ʹ�������߳��л����������������������ݡ�
		notify();	//�ͷ������������������ȴ������������ݵ��߳�		
	}
	
	synchronized int withdraw(int money){	//ȡ���������ʵ��ȡ�ߵĽ��
		//����˺�û������ȴ���
		if(!haveMoney){	
			try{
				wait();
			}catch(InterruptedException e){	}
		}
		
		//����˺���������haveMoneyΪtrue����ȡ��
		if(balance > money){
			balance = balance - money;			
		}else {
			money = balance;	//����ʱ��ȡ����
			balance = 0;
		}		
		System.out.println("ȡ��"+money+"Ԫ���������Ϊ��"+balance);
		haveMoney = false;	//ȡ���ı�������ʹ�������߳��л����������������������ݡ�
		notify();	//�ͷ������������������ȴ������������ݵ��߳�
		
		return money;
	}
}
