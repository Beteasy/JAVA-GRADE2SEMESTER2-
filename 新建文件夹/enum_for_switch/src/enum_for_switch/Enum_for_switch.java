package enum_for_switch;

enum Fruit{
	apple,pear,watermalen;
}
public class Enum_for_switch {
	public static void main(String args[]) {
	double price = 0;
	for(Fruit fruit:Fruit.values()) {
		switch(fruit) {
		case apple:
			price = 1.5;
			System.out.println(price);break;
		case pear:
			price = 2.0;
			System.out.println(price);break;
		case watermalen:
			price =1.5;
		System.out.println(price);break;
		}
	}
	}
}
