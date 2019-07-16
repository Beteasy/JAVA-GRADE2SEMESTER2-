package shiyan5;

public class DangerException extends Exception{
	private static final long serialVersionUID = 1L;
	
	//构造方法
	public DangerException(String message) {
		super(message);		//不知道怎么调用父类的构造方法
	}
}
