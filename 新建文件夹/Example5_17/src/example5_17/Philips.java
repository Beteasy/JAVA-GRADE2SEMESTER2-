package example5_17;

public class Philips implements Advertisement {		//Philips实现Advertisement接口

	@Override
	public void showAdvertisement() {
		// TODO Auto-generated method stub
		System.out.println("@@@@@@@@@@@@@@@@@@");
		System.out.println("没有最好，只有更好");
		System.out.println("@@@@@@@@@@@@@@@@@@");
	}

	@Override
	public String showCorpName() {
		// TODO Auto-generated method stub
		return "飞利浦";
	}

}
