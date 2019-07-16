package ch13_13_1;

public class Example13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle(10);
		Cone<Circle> coneOne = new Cone<Circle>(circle);
		coneOne.setHeight(16);
		System.out.println(coneOne.computeVolume());
		
		Rect rect = new Rect(15,23);
		Cone<Rect> coneTwo = new Cone<Rect>(rect);
		coneTwo.setHeight(98);
		System.out.println(coneTwo.computeVolume());
	}

}
