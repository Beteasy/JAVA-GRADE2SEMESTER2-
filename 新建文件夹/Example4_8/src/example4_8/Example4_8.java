package example4_8;

public class Example4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lader.downLader = 100;	//Lader���ֽ��뱻���ڵ��ڴ棬ͨ���������������
		Lader laderOne = new Lader();
		Lader laderTwo = new Lader();
		laderOne.setUpLaderr(28);
		laderTwo.setUpLaderr(66);
		System.out.println("laderOne���ϵ�:"+laderOne.getUpLader());
		System.out.println("laderOne���µ�:"+laderOne.getDownLader());
		System.out.println("laderTwo���ϵ�:"+laderTwo.getUpLader());
		System.out.println("laderTwo���ϵ�:"+laderTwo.getDownLader());
	}

}
