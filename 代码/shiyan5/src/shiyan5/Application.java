package shiyan5;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntegerGroup integerGroup = new IntegerGroup();
		//策略A，奇偶分组
		StrategyOne strategyOne = new StrategyOne();
		integerGroup.setStrategy(strategyOne);
		integerGroup.integerDivide(20);
		System.out.println("");
		//策略B，用3求余分组
		StrategyTwo strategyTwo = new StrategyTwo();
		integerGroup.setStrategy(strategyTwo);
		integerGroup.integerDivide(20);
	}
}
