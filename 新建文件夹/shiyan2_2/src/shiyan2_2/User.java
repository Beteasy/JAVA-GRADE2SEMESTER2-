package shiyan2_2;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD dataCD = new CD();
		//dataCD.setContent();
		Computer computerIMB = new Computer();
		computerIMB.putCD(dataCD);
		System.out.println("dataCD�ϵ����ݣ�");
		for(int i=0; i<dataCD.getSize(); i++) {
			System.out.print(" " + dataCD.content[i]);
		}
		
		System.out.println("\n\n��dataCD�����ݸ��Ƶ������:computerIMB.");
		computerIMB.copyToComouter();
		
		System.out.println("computerIMB�ϵ����ݣ�");
		computerIMB.showData();
		
		System.out.println("\n\ncomputerIMB��ÿ����������12��");
		computerIMB.addData(12);
		
		System.out.println("�����޸ĺ�computerIMB�ϵ����ݣ�");
		computerIMB.showData();
		
		System.out.println("\n\ncomputerIMB����ֵ������ݸ��Ƶ�CD:dataCD");
		computerIMB.copyToCD();
		
		System.out.println("dataCD�ϵ����ݣ�");
		for(int i=0; i<dataCD.getSize(); i++) {
			System.out.print(" " + dataCD.content[i]);
		}
	}

}
