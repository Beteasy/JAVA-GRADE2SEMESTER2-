package exampe5_15;

public class Teater implements Temperature, Charge {

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("电影院：门票，10元/张");
	}

	@Override
	public void controlTemperature() {
		// TODO Auto-generated method stub
		System.out.println("安装了中央空调");
	}

}
