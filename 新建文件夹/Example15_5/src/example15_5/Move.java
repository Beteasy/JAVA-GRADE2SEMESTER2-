package example15_5;

public class Move implements Runnable{
	int i=1, sum =0;
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+"开始计算");
		while(i<=10) {
			sum += i;
			System.out.println(""+sum);
			if(i==5) {
				System.out.println(thread.getName()+"完成任务了! i="+i);
				Thread threadTwo = new Thread(this);		//threadTwo与threadOne的目标对象相同
				threadTwo.setName("李四");
				threadTwo.start();		//启动threadTwo
				i++;
				return ;		//threadOne死亡
			}
			i++;
			try {
				Thread.sleep(300);
			}
			catch(InterruptedException e) {}
		}
	}
}
