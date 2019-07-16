package shiyan5;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//商品名称
		String[] name= {"苹果","炸药","西服","硫酸","手表","硫磺"};
		//检查六件物品
		Goods[] goods = new Goods[name.length];
		
		//创建商品对象
		for(int i=0; i<name.length; i++) {
			goods[i] = new Goods();
			goods[i].setName(name[i]);
			if(goods[i].getName().equals("炸药") || goods[i].getName().equals("硫酸") || goods[i].getName().equals("硫磺")) {
				goods[i].setIsDanger(false);
			}
			else {
				goods[i].setIsDanger(true);
			}
		}
		
		//检查商品
		Machine machine  = new Machine();
		for(int i=0; i<name.length; i++) {
			try {
				machine.checkBag(goods[i]);
			}
			catch(DangerException e) {
				System.out.println(goods[i].getName()+e.getMessage());
				System.out.println(goods[i].getName()+","+"被禁止!\n");
			}
		}
	}

}
