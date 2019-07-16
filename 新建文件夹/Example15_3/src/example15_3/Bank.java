package example15_3;

public class Bank implements Runnable{
	private int number = 0;
	
	public void setMoney(int m) {
		number = m;
	}
	
	public void run() {
		while(true) {
			String name = Thread.currentThread().getName();
			if(name.equals("One")) {
				if(number<=160) {
					System.out.println(name+"进入死亡状态");
					return;		//threadOne的run方法结束
				}
				number += 10;
				System.out.println("我是"+name+"现在numbre="+number);
			}
			/*if(Thread.currentThread().getName().equals("Two"))*/
			if(name.equals("Two")){
				if(number<=0) {
					System.out.println(name+"进入死亡状态");
					return ;
				}
				number -= 100;
				System.out.println("我是"+name+"现在numbre="+number);
			}
			try {
				Thread.sleep(800);
			}
			catch(InterruptedException e) {}
			
		}
	}
}
