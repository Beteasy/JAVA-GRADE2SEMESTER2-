package example6_6;

public class DangerException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final String message = "����";
	public String warnMess() {
		return message;
	}
}
