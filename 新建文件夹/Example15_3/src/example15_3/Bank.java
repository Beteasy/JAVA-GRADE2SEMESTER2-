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
					System.out.println(name+"��������״̬");
					return;		//threadOne��run��������
				}
				number += 10;
				System.out.println("����"+name+"����numbre="+number);
			}
			/*if(Thread.currentThread().getName().equals("Two"))*/
			if(name.equals("Two")){
				if(number<=0) {
					System.out.println(name+"��������״̬");
					return ;
				}
				number -= 100;
				System.out.println("����"+name+"����numbre="+number);
			}
			try {
				Thread.sleep(800);
			}
			catch(InterruptedException e) {}
			
		}
	}
}
