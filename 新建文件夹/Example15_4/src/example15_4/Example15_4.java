package example15_4;

public class Example15_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Move move = new Move();
		Thread threadOne = new Thread(move);
		Thread threadTwo = new Thread(move);
		threadOne.setName("����");
		threadTwo.setName("����");
		threadOne.start();
		threadTwo.start();
	}

}
