
public class IntegerException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	public IntegerException(int m) {
		message = "年龄" + m + "不合理";
	}
	public String toString() {
		return message;
	}
}
