package ʵ��_Java�߼����.ʵ��5;

//��������
public class IntegerGroup {
	GroupStrategy strategy;
    
    public void setStrategy(GroupStrategy strategy) {
    	this.strategy=strategy;
    } 
    
    public void integerDivide(int n){
       if(strategy!=null)
          strategy.group(n); 
       else
         System.out.println("û�з�����Կ���");
    }
}
