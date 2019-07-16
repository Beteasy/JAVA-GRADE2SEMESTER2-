package shiyan2_2;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD dataCD = new CD();
		//dataCD.setContent();
		Computer computerIMB = new Computer();
		computerIMB.putCD(dataCD);
		System.out.println("dataCD上的内容：");
		for(int i=0; i<dataCD.getSize(); i++) {
			System.out.print(" " + dataCD.content[i]);
		}
		
		System.out.println("\n\n将dataCD的数据复制到计算机:computerIMB.");
		computerIMB.copyToComouter();
		
		System.out.println("computerIMB上的内容：");
		computerIMB.showData();
		
		System.out.println("\n\ncomputerIMB将每个数据增加12；");
		computerIMB.addData(12);
		
		System.out.println("数据修改后，computerIMB上的内容：");
		computerIMB.showData();
		
		System.out.println("\n\ncomputerIMB将增值后的数据复制到CD:dataCD");
		computerIMB.copyToCD();
		
		System.out.println("dataCD上的内容：");
		for(int i=0; i<dataCD.getSize(); i++) {
			System.out.print(" " + dataCD.content[i]);
		}
	}

}
