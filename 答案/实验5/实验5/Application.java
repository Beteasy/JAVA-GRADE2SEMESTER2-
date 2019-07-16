package 实验_Java高级编程.实验5;

public class Application{
	public static void main(String args[]){
		IntegerGroup makeGroup=new IntegerGroup();  //上下文对象
		
		makeGroup.setStrategy(new StrategyOne());   
		makeGroup.integerDivide(20);
		
		makeGroup.setStrategy(new StrategyTwo());   
		makeGroup.integerDivide(20);  
	          
	}
}
