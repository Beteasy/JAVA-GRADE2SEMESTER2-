package example5_13;

public class Example5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal;
		animal = new Dog();
		Simulator sim = new Simulator();
		sim.playSound(animal);
		animal = new Cat();
		sim.playSound(animal);
	}

}
