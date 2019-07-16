package handleException1;

public class ThrowStatement extends Exception{

	/**
	 * exp方法抛出异常，并在方法内部使用try-catch及时处理异常
	 */
	private static final long serialVersionUID = 1L;
	public static void exp(int ptr) {
		try {
			if(ptr == 0) {
				throw new NullPointerException();
			}
		}             
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		int i=0;
		ThrowStatement.exp(i);
	}
}
