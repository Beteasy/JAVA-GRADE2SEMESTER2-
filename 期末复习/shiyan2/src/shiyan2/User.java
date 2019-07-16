package shiyan2;

public class User {
	public static void main(String[] args) {
		int b[] ={1,2,3,4,5,6,7,8};	//CD对象的初始数据内容
		CD dataCD = new CD();
		dataCD.setSize(b.length);
		dataCD.setContent(b);
		
		System.out.println("dataCD上的内容:");
		for(int i=0; i<dataCD.size; i++) {
			System.out.print(dataCD.content[i]+"  ");
		}
		
		Computer computerIMB = new Computer();
		computerIMB.putCD(dataCD);
		computerIMB.copyToComputer();
		System.out.println("\ncomputerIMB上的内容:");
		computerIMB.showData();
		
		System.out.println("\ncomputerIMB将每个数据增加12；");
		computerIMB.addData(12);
		System.out.println("数据修改后，computerIMB上的内容：");
		computerIMB.showData();
		
		System.out.println("\ncomputerIMB将增值后的数据复制到CD:dataCD：");
		computerIMB.copyToCD();
		System.out.println("dataCD上的内容：");
		for(int i=0; i<dataCD.size; i++) {
			System.out.print(dataCD.content[i]+"  ");
		}
	}
}
