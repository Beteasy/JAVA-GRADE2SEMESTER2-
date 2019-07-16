package handleException2;

public class ThrowStatement extends Exception{

	/**
	 * exp方法抛出异常，在方法内部不处理异常，尽在方头部声明可能抛出的异常
	 */
	private static final long serialVersionUID = 1L;
	public static void exp(int ptr) throws NullPointerException{
		if(ptr == 0) {
			throw new NullPointerException();	//抛出异常
		}
	}
	
	public static void main(String[] args) {
		int i = 0;
		ThrowStatement.exp(i);
	}

}
