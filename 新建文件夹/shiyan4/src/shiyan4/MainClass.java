package shiyan4;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int num_circle;
		double radius;
		double height;
		double width;
		double area;
		System.out.println("�ܹ���10�������:");
		Scanner reader = new Scanner(System.in);
		Geometry[] tuxing = new Geometry[10];
		
		//����Բ��
		System.out.println("����������Բ�εĸ���:");
		num_circle = reader.nextInt();
		for(int i=0; i<num_circle; i++) {
			System.out.println("�������"+(i+1)+"��Բ�εİ뾶:");
			radius = reader.nextDouble();
			tuxing[i] = new Circle(radius);
		}
		
		//��������
		System.out.println("Բ�ζ��󴴽���ɣ�������"+(10-num_circle)+"������");
		for(int i=num_circle; i<10; i++) {
			System.out.println("�������"+(i-num_circle+1)+"�����εĸ߶ȺͿ��:");
			height = reader.nextDouble();
			width = reader.nextDouble();
			tuxing[i] = new Rectangle(height,width);
		}
		reader.close();
		
		TotalArea total = new TotalArea(tuxing);
		area = total.computeTotalArea();
		System.out.printf("����ͼ�ε����֮��Ϊ(����С�������λ):%.2f",area);
	}
}
