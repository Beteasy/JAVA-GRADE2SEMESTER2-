package example_4_5;

public class Example_4_5 {
	public static void main(String[] args) {
		Circle circle = new Circle(10);
		System.out.println("main������circle������:    "+circle);
		System.out.println("main������circle�İ뾶:    "+circle.getRadius());
		Circular circular = new Circular(circle,20);
		System.out.println("circular��bottom������:    "+circular.bottom);
		System.out.println("circular��bottom�İ뾶:    "+circular.getBottomRadius());
		System.out.println("circular�����:    "+circular.getVolme());
		double r = 8888;
		System.out.println("Բ׶���ĵ�Բ�İ뾶:"+r);
		circular.setBottomRadius(r);
		System.out.println("Բ׶�µİ뾶:"+circular.getBottomRadius());
		System.out.println("Բ׶�µ����:"+circular.getVolme());
		System.out.println("main������circle������:    "+circle);
		
		System.out.println("main������circle�İ뾶:    "+circle.getRadius());
		System.out.println("main������circle�����ý������仯");
		circle = new Circle(1000);
		System.out.println("����main�����е�circle������:   "+circle);
		System.out.println("����main������circle�İ뾶:    "+circle.getRadius());
		System.out.println("���ǲ�Ӱ��circular��bottom������");
		System.out.println("circular��bottom������:    "+circular.bottom);
		System.out.println("circular��bottom�İ뾶:    "+circular.getBottomRadius());
	}
}
