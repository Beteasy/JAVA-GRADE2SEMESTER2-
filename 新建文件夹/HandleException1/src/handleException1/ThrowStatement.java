package handleException1;

public class ThrowStatement extends Exception{

	/**
	 * exp�����׳��쳣�����ڷ����ڲ�ʹ��try-catch��ʱ�����쳣
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
