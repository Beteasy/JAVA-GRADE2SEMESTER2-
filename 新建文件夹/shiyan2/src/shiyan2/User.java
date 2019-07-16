package shiyan2;

public class User {
	public static void main(String[] args) {
		CD dataCD = new CD();
		dataCD.setSize();
		dataCD.setContent();
		Computer computerIMB = new Computer();
		computerIMB.putCD(dataCD);	//computerIMB对象将CD类的对象“dataCD”的引用传递给computerIMB对象的成员变量“includeCD”
		computerIMB.copyToComputer();
		System.out.println("dataCD上的内容:");
		for(int i=0; i<dataCD.getSize(); i++) {
			System.out.print(" "+dataCD.content[i]);
		}
		for(int i=0; i<computerIMB.data.length; i++) {
			System.out.print(computerIMB.data[i]+" ");
		}
		System.out.println(dataCD.getSize());
		computerIMB.showData();
	}
	
}
