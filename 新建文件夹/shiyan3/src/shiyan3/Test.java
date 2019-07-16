package shiyan3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		double height;
		double weight;
		double average;
		int num = 2;
		
		ChinaPerson china[] = new ChinaPerson[num];
		ChinaPerson ch = new ChinaPerson(0,0);
		AmericaPerson america[] = new AmericaPerson[num];
		AmericaPerson amer = new AmericaPerson(0,0);
		BeijingPerson beijing[]= new BeijingPerson[num];
		BeijingPerson bj = new BeijingPerson(0,0);
		
		ch.speakHell();
		amer.speakHell();
		bj.speakHell();
	
		for(int i=0; i<num; i++) {
			System.out.println("�������" + (i+1) + "��" + "�й��˵���ߺ�����:");
			height = reader.nextDouble();
			weight = reader.nextDouble();
			china[i] = new ChinaPerson(height,weight);
		}
		
		
		for(int i=0; i<num; i++) {
			System.out.println("�������" + (i+1) + "��" + "�����˵���ߺ�����:");
			height = reader.nextDouble();
			weight = reader.nextDouble();
			america[i] = new AmericaPerson(height,weight);
		}
		
		
		for(int i=0; i<num; i++) {
			System.out.println("�������" + (i+1) + "��" + "�����˵���ߺ�����:");
			height = reader.nextDouble();
			weight = reader.nextDouble();
			beijing[i] = new BeijingPerson(height,weight);
		}
		
		reader.close();
		
		
		
		average = ch.averageHeight(china);
		System.out.println("�й��˵�ƽ�����:" + average + "��");
		
		average = amer.averageHeight(america);
		System.out.println("American's average height:" + average + "cm");
		
		average = bj.averageHeight(beijing);
		System.out.println("�����˵�ƽ�����:" + average + "����\n");
		
		average = ch.averageWeight(china);
		System.out.println("�й��˵�ƽ������:" + average + "����");
		
		average = amer.averageWeight(america);
		System.out.println("American's average weight:" + average + "kg");
		
		average = bj.averageWeight(beijing);
		System.out.println("�����˵�ƽ������:" + average + "����\n");
		
		ch.chinaGongfu();
		amer.americaBoxing();
		bj.beijingOoera();
		bj.chinaGongfu();
	}

}
