package example_4_7;

public class Example_4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rect = new Rectangle();
		Circle circle = new Circle();
		
		Geometry geometry = new Geometry(rect,circle);
		geometry.setRectanglePosition(30, 40);
		geometry.setRectangleWidthAndHeight(120, 80);
		geometry.setCirclePosition(260, 30);
		geometry.setCircleRadius(60);
		System.out.println("����ͼ����Բ�;��ε�λ�ù�ϵ��:");
		geometry.showState();
		
		System.out.println("����ͼ�����µ�����Բ�;��ε�λ��");
		geometry.setRectanglePosition(220, 160);
		geometry.setCirclePosition(40, 30);
		System.out.println("�����󼸺�ͼ����Բ�;��ε�λ�ù�ϵ��:");
		geometry.showState();
	}

}
