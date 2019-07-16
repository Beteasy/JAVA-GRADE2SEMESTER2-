package example15_1;

public class SpeakHello extends Thread{
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.println("hello"+i);
		}
	}

}
