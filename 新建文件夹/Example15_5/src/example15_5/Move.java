package example15_5;

public class Move implements Runnable{
	int i=1, sum =0;
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+"��ʼ����");
		while(i<=10) {
			sum += i;
			System.out.println(""+sum);
			if(i==5) {
				System.out.println(thread.getName()+"���������! i="+i);
				Thread threadTwo = new Thread(this);		//threadTwo��threadOne��Ŀ�������ͬ
				threadTwo.setName("����");
				threadTwo.start();		//����threadTwo
				i++;
				return ;		//threadOne����
			}
			i++;
			try {
				Thread.sleep(300);
			}
			catch(InterruptedException e) {}
		}
	}
}
