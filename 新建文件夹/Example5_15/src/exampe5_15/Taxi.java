package exampe5_15;

public class Taxi implements Charge, Temperature {

	@Override
	public void controlTemperature() {
		// TODO Auto-generated method stub
		System.out.println("��װ��Hair�յ�");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("���⳵:3.20/������3����");
	}

}
