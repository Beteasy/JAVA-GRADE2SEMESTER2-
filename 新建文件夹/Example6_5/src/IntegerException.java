
public class IntegerException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	public IntegerException(int m) {
		message = "����" + m + "������";
	}
	public String toString() {
		return message;
	}
}
