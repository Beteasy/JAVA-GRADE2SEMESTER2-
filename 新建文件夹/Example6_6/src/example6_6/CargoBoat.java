package example6_6;

public class CargoBoat {
	int realContent;	//װ�ص�����
	int maxContent;		//���װ����
	
	public void setMaxContent(int m) {
		maxContent = m;
	}
	
	public void loading(int m) throws DangerException{
		realContent += m;
		if(realContent>maxContent) {
			throw new DangerException();
		}
		System.out.println("Ŀǰװ����"+realContent+"�ֻ���");
	}
}
