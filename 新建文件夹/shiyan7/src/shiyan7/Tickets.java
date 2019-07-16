/*package shiyan7;

public class Tickets {
	int rows;			//Ʊ��������
	int columns; 		//Ʊ��������
	int total;			//��Ʊ��=����*����
	int freeSeatNum;	//��Ʊ����
	boolean isSelling;	//true��ʾ������Ʊ;����ƱʱΪfalse�����ʾ������Ʊ
	
	public Tickets(int rows, int columns) {
		//���췽��
		this.rows = rows;
		this.columns = columns;
		total = this.rows*this.columns;
		freeSeatNum = this.total;
		if(freeSeatNum > 0) {
			isSelling = true;
		}
		else {
			isSelling = false;
		}
	}
	
	//��Ʊ�������۳�num��Ʊ
	synchronized public void sellTicket(int num) {
		System.out.println("��ǰ��Ʊ:"+freeSeatNum+"���빺Ʊ��:"+num);
		if(!isSelling) {
			//��Ʊ�У�����ȴ���Ʊ
			
			try {
				//System.out.println("��ǰ��Ʊ:"+freeSeatNum+"���빺Ʊ��:"+num);
				System.out.println("��Ʊ�У�SellTicketThread Waiting...\n");
				wait();
			}
			catch(InterruptedException e) {}
		}
		else {
			//���û����Ʊ������Ʊ
			freeSeatNum -= num;
			System.out.println("������"+num+"��Ʊ");
			System.out.println("�ۺ���Ʊ��"+freeSeatNum+"\n");
			isSelling = false;		//��Ʊ��ı�������ʹ�������߳��л��������������
		}
		notify();				//�ͷ������������������ȴ������������ݵ��߳�
	}
	
	//��Ʊ�������˻�num��Ʊ
	synchronized public void returnTicket(int num) {
		if(isSelling) {
			//�������Ʊ������Ʊ�ȴ�
			
			try {
				System.out.println("��Ʊ�У�ReturnTicketThread Waiting...");
				wait();
			}
			catch(InterruptedException e) {}
		}
		else {
			//���û������Ʊ������Ʊ
			freeSeatNum += num;
			System.out.println("����"+num+"��Ʊ");
			System.out.println("��Ʊ����Ʊ:"+freeSeatNum+"\n");
			isSelling = true;
		}
		notify();
	}
}*/
package shiyan7;

public class Tickets {
	int rows;			//Ʊ��������
	int columns; 		//Ʊ��������
	int total;			//��Ʊ��=����*����
	int freeSeatNum;	//��Ʊ����
	boolean isSelling;	//true��ʾ������Ʊ;����ƱʱΪfalse�����ʾ������Ʊ
	
	public Tickets(int rows, int columns) {
		//���췽��
		this.rows = rows;
		this.columns = columns;
		total = this.rows*this.columns;
		freeSeatNum = this.total;
		if(freeSeatNum > 0) {
			isSelling = true;
		}
		else {
			isSelling = false;
		}
	}
	
	//��Ʊ�������۳�num��Ʊ
	synchronized public void sellTicket(int num) {
		System.out.println("��ǰ��Ʊ:"+freeSeatNum+"���빺Ʊ��:"+num);
		/*if(!isSelling)*/while(!isSelling) {		//�˴�Ϊwhile
			//��Ʊ�У�����ȴ���Ʊ
			try {
				System.out.println("��Ʊ�У�SellTicketThread Waiting...\n");
				wait();
			}
			catch(InterruptedException e) {}
		}
		
		//Ʊ��Ϊ0��С�����趩��Ʊ��--δ���ǵ�
		if(freeSeatNum == 0 || freeSeatNum < num) {
			System.out.println("Tickets sold out or not enough tickets!");
			try {
				System.out.println("SellTicketThread Waiting.........");
				wait();
			}
			catch(InterruptedException e) {}
		}
		
		//���û����Ʊ������Ʊ
		if(freeSeatNum >= num) {
			freeSeatNum -= num;
			System.out.println("������"+num+"��Ʊ");
			System.out.println("�ۺ���Ʊ��"+freeSeatNum+"\n");
		}
		isSelling = false;		//��Ʊ��ı�������ʹ�������߳��л��������������
		notify();				//�ͷ������������������ȴ������������ݵ��߳�
	}
	
	//��Ʊ�������˻�num��Ʊ
	synchronized public void returnTicket(int num) {
		while(isSelling) {
			//�������Ʊ������Ʊ�ȴ�
			try {
				System.out.println("��Ʊ�У�ReturnTicketThread Waiting...");
				wait();
			}
			catch(InterruptedException e) {}
		}
		
		//û��Ʊ���۳�����Ʊ�������۳�Ʊ��Ʊ�����ܰ�����Ʊ
		if(freeSeatNum == total || num > total-freeSeatNum) {
			System.out.println("û��Ʊ���۳�����Ʊ�������۳�Ʊ����������Ʊ!");	
			System.out.println();
			
			isSelling = true;
			notify();	
		}
		//���û������Ʊ������Ʊ
		else {
			freeSeatNum += num;
			System.out.println("����"+num+"��Ʊ");
			System.out.println("��Ʊ����Ʊ:"+freeSeatNum+"\n");
			isSelling = true;
			notify();
		}

	}
}
