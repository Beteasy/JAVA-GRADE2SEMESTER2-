package example15_5;

public class Example15_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Move move = new Move();
		Thread threadOne = new Thread(move);
		threadOne.setName("уехЩ");
		threadOne.start();
	}

}
