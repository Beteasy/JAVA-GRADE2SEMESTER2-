package shiyan4;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int num_circle;
		double radius;
		double height;
		double width;
		double area;
		System.out.println("总共有10个多边形:");
		Scanner reader = new Scanner(System.in);
		Geometry[] tuxing = new Geometry[10];
		
		//创建圆形
		System.out.println("请输入其中圆形的个数:");
		num_circle = reader.nextInt();
		for(int i=0; i<num_circle; i++) {
			System.out.println("请输入第"+(i+1)+"个圆形的半径:");
			radius = reader.nextDouble();
			tuxing[i] = new Circle(radius);
		}
		
		//创建矩形
		System.out.println("圆形对象创建完成，将创建"+(10-num_circle)+"个矩形");
		for(int i=num_circle; i<10; i++) {
			System.out.println("请输入第"+(i-num_circle+1)+"个矩形的高度和宽度:");
			height = reader.nextDouble();
			width = reader.nextDouble();
			tuxing[i] = new Rectangle(height,width);
		}
		reader.close();
		
		TotalArea total = new TotalArea(tuxing);
		area = total.computeTotalArea();
		System.out.printf("各种图形的面积之和为(保留小数点后两位):%.2f",area);
	}
}
