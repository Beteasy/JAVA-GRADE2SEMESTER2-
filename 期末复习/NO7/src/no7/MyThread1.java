package no7;

public class MyThread1 implements Runnable {
	int number;
	
	public MyThread1(int number){
		this.number = number;
	}
	
	public void run() {
		for(int i=1; i<=number; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
		}
	}
}
