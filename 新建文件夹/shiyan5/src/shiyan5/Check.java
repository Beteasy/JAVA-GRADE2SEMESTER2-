package shiyan5;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��Ʒ����
		String[] name= {"ƻ��","ըҩ","����","����","�ֱ�","���"};
		//���������Ʒ
		Goods[] goods = new Goods[name.length];
		
		//������Ʒ����
		for(int i=0; i<name.length; i++) {
			goods[i] = new Goods();
			goods[i].setName(name[i]);
			if(goods[i].getName().equals("ըҩ") || goods[i].getName().equals("����") || goods[i].getName().equals("���")) {
				goods[i].setIsDanger(false);
			}
			else {
				goods[i].setIsDanger(true);
			}
		}
		
		//�����Ʒ
		Machine machine  = new Machine();
		for(int i=0; i<name.length; i++) {
			try {
				machine.checkBag(goods[i]);
			}
			catch(DangerException e) {
				System.out.println(goods[i].getName()+e.getMessage());
				System.out.println(goods[i].getName()+","+"����ֹ!\n");
			}
		}
	}

}
