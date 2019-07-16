package 实验_Java高级编程.实验5;

//上下文类
public class IntegerGroup {
	GroupStrategy strategy;
    
    public void setStrategy(GroupStrategy strategy) {
    	this.strategy=strategy;
    } 
    
    public void integerDivide(int n){
       if(strategy!=null)
          strategy.group(n); 
       else
         System.out.println("没有分组策略可用");
    }
}
