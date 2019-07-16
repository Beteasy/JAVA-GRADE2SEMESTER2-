package example5_17;

public class AdvertisementBoard{
	public void show(Advertisement adver) {
		System.out.println("广告牌显示" + adver.showCorpName() + "公司的广告词:");
		adver.showAdvertisement();
	}
}
