package �������������.ʵ��3;

public class Test {

	public static void main(String[] args) {
		ChinaPerson chinaPerson=new ChinaPerson();
		AmericaPerson americanPerson=new AmericaPerson();
		BeijingPerson beijingPerson=new BeijingPerson();		
	      
		//speakHello��������
		chinaPerson.speakHello();
		americanPerson.speakHello();
		beijingPerson.speakHello();
		System.out.println();		
		
		//����ChinaPerson��������
		double[] height1 = new double[] {1.6, 1.65, 1.75, 1.77};
		double[] weight1 = new double[] {50.0, 52.0, 70.0, 75.0};
		ChinaPerson[] chinese=new ChinaPerson[height1.length];		
		for(int i=0; i<height1.length; i++) {
			chinese[i] = new ChinaPerson(weight1[i], height1[i]);
		}		
		
		//����AmericaPerson��������
		double[] height2 = new double[] {1.6, 1.65, 1.75, 1.77,1.9};
		double[] weight2 = new double[] {50.0, 52.0, 70.0, 75.0, 85.0};
		AmericaPerson[] american=new AmericaPerson[height2.length];		
		for(int i=0; i<height2.length; i++) {
			american[i] = new AmericaPerson(weight2[i], height2[i]);
		}		
		
		//����BeijingPerson��������
		double[] height3 = new double[] {1.6, 1.65, 1.75, 1.77, 1.9, 1.8};
		double[] weight3 = new double[] {50.0, 52.0, 70.0, 75.0, 85.0,78.0};
		BeijingPerson[] beijingPeople=new BeijingPerson[height3.length];		
		for(int i=0; i<height3.length; i++) {
			beijingPeople[i] = new BeijingPerson(weight3[i], height3[i]);
		}
		
		//����ƽ�����
		System.out.println("�й��˵�ƽ�����:"+chinaPerson.averageHeight(chinese)+" ��");		  
		americanPerson.averageHeight(american);
		System.out.println("�����˵�ƽ�����:"+beijingPerson.averageHeight(beijingPeople)*100+"����");
		System.out.println();
		
		//����ƽ������ 
		System.out.println("�й��˵�ƽ������:"+chinaPerson.averageWeight(chinese)+" ����");
		americanPerson.averageWeight(american);
		System.out.println("�����˵�ƽ������:"+beijingPerson.averageWeight(beijingPeople)+"����");
		System.out.println();
	      
		chinaPerson.chinaGongfu();
		americanPerson.americanBoxing();
		beijingPerson.beijingOpera() ;
		beijingPerson.chinaGongfu();
	}
}
