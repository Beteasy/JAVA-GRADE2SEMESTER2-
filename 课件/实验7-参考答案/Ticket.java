package Thread;

public class Ticket {
	int rows;					//Ʊ��������
	int columns;				//Ʊ��������	
	int total;					//��Ʊ��
	int freeSeatNum;			//��Ʊ����
	boolean isSelling;			//true��ʾ������Ʊ; false���ʾ������Ʊ
	
	public Ticket(){}
	
	public Ticket(int rows, int columns){
		this.rows = rows;
		this.columns = columns;
		isSelling = true;	
		
		freeSeatNum = rows * columns;
		total = rows * columns;
		
		System.out.println("һ����"+freeSeatNum+"��Ʊ");
		System.out.println();
	}
	
	//��Ʊ����
	synchronized public void sellTicket(int num){
		System.out.println("��Ʊǰ��Ʊ��"+freeSeatNum+"; �빺Ʊ����"+num);	
	
		//���������Ʊ(false)����ȴ�
		while(!isSelling){
			try{
				System.out.println("��Ʊ�У�SellTicketThread Waiting...");
				System.out.println();
				wait();					
			}catch(InterruptedException ie){}
		}	
		
		//��Ʊ��Ϊ0��С�����趩��Ʊ��
		if(freeSeatNum == 0 || freeSeatNum < num){
			System.out.println("Tickets sold out or not enough tickets!");
			try{
				System.out.println("SellTicketThread Waiting........");
				System.out.println();
				wait();					
			}catch(InterruptedException ie){}			
		}
		
		//������Ʊ	
		if(freeSeatNum >= num){		
			freeSeatNum = freeSeatNum - num;
			
			System.out.println("������"+num+"��Ʊ");	
			System.out.println("��Ʊ����Ʊ��"+freeSeatNum);	
			System.out.println();
		}	
		
		isSelling = false;
		notify();
	}
	
	//��Ʊ
	synchronized public void returnTicket(int num){
		
		//�����Ʊ�߳�������Ʊ(true)����ȴ�
		while(isSelling){
			try{
				System.out.println("��Ʊ�У�ReturnTicketThread Waiting...");
				wait();		
			}catch(InterruptedException ie){}
		}
		
		//û��Ʊ���۳�����Ʊ�������۳�Ʊ��Ʊ�����ܰ�����Ʊ
		if(freeSeatNum == total || num > (total-freeSeatNum)){
			System.out.println("û��Ʊ���۳�����Ʊ�������۳�Ʊ����������Ʊ!");	
			System.out.println();
			
			isSelling = true;
			notify();	
		}else {//������Ʊ����
			freeSeatNum = freeSeatNum + num;
			
			System.out.println("����"+num+"��Ʊ");	
			System.out.println("��Ʊ����Ʊ��"+freeSeatNum);	
			System.out.println();
			
			isSelling = true;	
			notify();			
		}
	}
	
	//�ж�Ʊ�Ƿ�û��ʼ��
	boolean isFull(){
		if(freeSeatNum == rows * columns)
			return true;
		else 
			return false;
	}
	
	//�ж�Ʊ�Ƿ�ȫ������
	boolean isSoldOut(){
		if(freeSeatNum==0)
			return true;
		else
			return false;
	}	
}
