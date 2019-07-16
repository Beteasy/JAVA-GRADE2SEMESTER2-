package example5_17;

public class Lenovo implements Advertisement{		//Lenovo实现Advertisements接口
	
	public void showAdvertisement() {
		System.out.println("**************");
		System.out.println("让世界变得很小");
		System.out.println("**************");
	}
	
	public String showCorpName() {
		return "联想";
	}
}
