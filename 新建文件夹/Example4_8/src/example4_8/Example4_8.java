package example4_8;

public class Example4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lader.downLader = 100;	//Lader的字节码被夹在到内存，通过类名操作类变量
		Lader laderOne = new Lader();
		Lader laderTwo = new Lader();
		laderOne.setUpLaderr(28);
		laderTwo.setUpLaderr(66);
		System.out.println("laderOne的上底:"+laderOne.getUpLader());
		System.out.println("laderOne的下底:"+laderOne.getDownLader());
		System.out.println("laderTwo的上底:"+laderTwo.getUpLader());
		System.out.println("laderTwo的上底:"+laderTwo.getDownLader());
	}

}
