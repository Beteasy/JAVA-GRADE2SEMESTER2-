package exampe5_15;

public class Taxi implements Charge, Temperature {

	@Override
	public void controlTemperature() {
		// TODO Auto-generated method stub
		System.out.println("安装了Hair空调");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("出租车:3.20/公里，起价3公里");
	}

}
