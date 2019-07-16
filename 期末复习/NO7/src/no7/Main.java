package no7;

public class Main {
	public static void main(String args[]) {
		MyThread1 th = new MyThread1(10);
		Thread threadOne = new Thread(th);
		Thread threadTwo = new Thread(th);
		threadOne.setName("threadOne");
		threadOne.start();
		threadTwo.setName("threadTwo");
		threadTwo.start();
	}
}
