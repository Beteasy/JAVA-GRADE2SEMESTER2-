package shiyan5;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntegerGroup integerGroup = new IntegerGroup();
		//����A����ż����
		StrategyOne strategyOne = new StrategyOne();
		integerGroup.setStrategy(strategyOne);
		integerGroup.integerDivide(20);
		System.out.println("");
		//����B����3�������
		StrategyTwo strategyTwo = new StrategyTwo();
		integerGroup.setStrategy(strategyTwo);
		integerGroup.integerDivide(20);
	}
}
