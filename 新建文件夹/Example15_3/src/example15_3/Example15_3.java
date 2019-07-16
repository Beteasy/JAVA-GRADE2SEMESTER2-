package example15_3;

public class Example15_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		bank.setMoney(300);
		Thread threadOne = new Thread(bank);
		Thread threadTwo = new Thread(bank);
		threadOne.setName("One");
		threadTwo.setName("Two");
		threadOne.start();
		threadTwo.start();
	}

}
