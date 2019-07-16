package 实验5;

public class Check {
	   public static void main(String args[]) {	      
	      String[] name ={"苹果","炸药","西服","硫酸","手表","硫磺"};//商品名称	      
	      Goods[] goods = new Goods[name.length]; //检查6件物品  	 
	      //创建商品对象
	      for(int i= 0;i<name.length;i++) {
	         goods[i] = new Goods();
	         if(i%2==0) {
	            goods[i].setDanger(false);
	            goods[i].setName(name[i]);
	         }
	         else {
	            goods[i].setDanger(true);
	            goods[i].setName(name[i]);
	         } 
	      }	      
	      
	      //检查商品
	      Machine machine = new Machine();
	      for(int i= 0;i<goods.length;i++) {
	    	  System.out.print(goods[i].getName());
	    	  try { 
	    		  machine.checkBag(goods[i]);
	    		  System.out.println("，检查通过\n");
	    	  }catch(DangerException e) {
	    		  System.out.println(e.getMessage());
	    		  System.out.println(goods[i].getName()+"，被禁止!\n"); 
	    	  }
	      }     
	   } 
}
