package shiyan2;

public class User {
	public static void main(String[] args) {
		CD dataCD = new CD();
		dataCD.setSize();
		dataCD.setContent();
		Computer computerIMB = new Computer();
		computerIMB.putCD(dataCD);	//computerIMB����CD��Ķ���dataCD�������ô��ݸ�computerIMB����ĳ�Ա������includeCD��
		computerIMB.copyToComputer();
		System.out.println("dataCD�ϵ�����:");
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
