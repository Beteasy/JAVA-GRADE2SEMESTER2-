package ʵ��5;

public class Check {
	   public static void main(String args[]) {	      
	      String[] name ={"ƻ��","ըҩ","����","����","�ֱ�","���"};//��Ʒ����	      
	      Goods[] goods = new Goods[name.length]; //���6����Ʒ  	 
	      //������Ʒ����
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
	      
	      //�����Ʒ
	      Machine machine = new Machine();
	      for(int i= 0;i<goods.length;i++) {
	    	  System.out.print(goods[i].getName());
	    	  try { 
	    		  machine.checkBag(goods[i]);
	    		  System.out.println("�����ͨ��\n");
	    	  }catch(DangerException e) {
	    		  System.out.println(e.getMessage());
	    		  System.out.println(goods[i].getName()+"������ֹ!\n"); 
	    	  }
	      }     
	   } 
}
