package example6_6;

public class Example6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoBoat ship = new CargoBoat();
		ship.setMaxContent(1000);
		int m = 600;
		try {
			ship.loading(m);	//δ����
			
			m=400;
			ship.loading(m);	//δ����
			
			m=367;
			ship.loading(m);	//����   �Ӵ��ж�
			
			m=555;
			ship.loading(m); 	//����  
		}
		catch(DangerException e){
			System.out.println(e.warnMess());
			System.out.println("�޷���װ��������"+m+"�ֵļ�װ��");
		}
		finally {
			System.out.println("������������");
		}
	}

}
