package 面向对象程序设计.实验3;

public class Test {

	public static void main(String[] args) {
		ChinaPerson chinaPerson=new ChinaPerson();
		AmericaPerson americanPerson=new AmericaPerson();
		BeijingPerson beijingPerson=new BeijingPerson();		
	      
		//speakHello方法测试
		chinaPerson.speakHello();
		americanPerson.speakHello();
		beijingPerson.speakHello();
		System.out.println();		
		
		//创建ChinaPerson对象数组
		double[] height1 = new double[] {1.6, 1.65, 1.75, 1.77};
		double[] weight1 = new double[] {50.0, 52.0, 70.0, 75.0};
		ChinaPerson[] chinese=new ChinaPerson[height1.length];		
		for(int i=0; i<height1.length; i++) {
			chinese[i] = new ChinaPerson(weight1[i], height1[i]);
		}		
		
		//创建AmericaPerson对象数组
		double[] height2 = new double[] {1.6, 1.65, 1.75, 1.77,1.9};
		double[] weight2 = new double[] {50.0, 52.0, 70.0, 75.0, 85.0};
		AmericaPerson[] american=new AmericaPerson[height2.length];		
		for(int i=0; i<height2.length; i++) {
			american[i] = new AmericaPerson(weight2[i], height2[i]);
		}		
		
		//创建BeijingPerson对象数组
		double[] height3 = new double[] {1.6, 1.65, 1.75, 1.77, 1.9, 1.8};
		double[] weight3 = new double[] {50.0, 52.0, 70.0, 75.0, 85.0,78.0};
		BeijingPerson[] beijingPeople=new BeijingPerson[height3.length];		
		for(int i=0; i<height3.length; i++) {
			beijingPeople[i] = new BeijingPerson(weight3[i], height3[i]);
		}
		
		//计算平均身高
		System.out.println("中国人的平均身高:"+chinaPerson.averageHeight(chinese)+" 米");		  
		americanPerson.averageHeight(american);
		System.out.println("北京人的平均身高:"+beijingPerson.averageHeight(beijingPeople)*100+"厘米");
		System.out.println();
		
		//计算平均体重 
		System.out.println("中国人的平均体重:"+chinaPerson.averageWeight(chinese)+" 公斤");
		americanPerson.averageWeight(american);
		System.out.println("北京人的平均体重:"+beijingPerson.averageWeight(beijingPeople)+"公斤");
		System.out.println();
	      
		chinaPerson.chinaGongfu();
		americanPerson.americanBoxing();
		beijingPerson.beijingOpera() ;
		beijingPerson.chinaGongfu();
	}
}
