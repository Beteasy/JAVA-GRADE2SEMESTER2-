package shiyan5;

public class IntegerGroup {
	
	GroupStrategy strategy;
	
	void setStrategy(GroupStrategy strategy) {
		this.strategy = strategy;
	}
	
	void integerDivide(int n) {
		if(strategy != null) {
			strategy.group(n);
		}
		else {
			System.out.println("û�з����㷨");
		}
	}
}
