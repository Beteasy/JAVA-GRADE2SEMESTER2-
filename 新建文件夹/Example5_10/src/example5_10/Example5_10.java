package example5_10;

public class Example5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1;
		animal1 = new Dog();		//animal是dog的上转型对象
		animal1.cry();
		
		Animal animal2;
		animal2 = new Cat();		//animal是cat的上转型对象
		animal2.cry();
		
	}

}
