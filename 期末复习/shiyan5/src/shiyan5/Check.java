package shiyan5;

public class Check {
	public static void main(String[] args) {
		String[] name = {"苹果","炸药","西服","硫酸","手表","硫磺"};
		Goods[] goods= new Goods[name.length];
		Machine machine = new Machine();
		
		for(int i=0;i<goods.length; i++) {
			goods[i] = new Goods();
			goods[i].setName(name[i]);
			if(goods[i].getName().equals("炸药")|| goods[i].getName().equals("硫酸") || goods[i].getName().equals("硫磺")) {
				goods[i].setIsDanger(true);
			}
			else {
				goods[i].setIsDanger(false);
			}
		}
		
		for(int i =0; i<goods.length; i++) {
			try {
				machine.checkBag(goods[i]);
				System.out.println(goods[i].getName()+",检查通过");
			}
			catch(DangerException e) {
				System.out.println(goods[i].getName()+e.getMessage());
				System.out.println(goods[i].getName()+",被禁止!");
			}
			
		}
	}
}
