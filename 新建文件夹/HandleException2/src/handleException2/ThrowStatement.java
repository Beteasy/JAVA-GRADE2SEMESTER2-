package handleException2;

public class ThrowStatement extends Exception{

	/**
	 * exp�����׳��쳣���ڷ����ڲ��������쳣�����ڷ�ͷ�����������׳����쳣
	 */
	private static final long serialVersionUID = 1L;
	public static void exp(int ptr) throws NullPointerException{
		if(ptr == 0) {
			throw new NullPointerException();	//�׳��쳣
		}
	}
	
	public static void main(String[] args) {
		int i = 0;
		ThrowStatement.exp(i);
	}

}
