package finallyTest;

/*
 * 系统抛出异常后，捕获异常，运行finally块，程序运行继续。
 */

public class FinallyTest {

	public static void main(String[] args) /*throws ArrayIndexOutOfBoundsException*/ {
		// TODO Auto-generated method stub
		FinallyTest t = new FinallyTest();
		t.foo();	//用try-catch处理了异常
		System.out.println("Excecution after Exception!!!");	//继续执行
	}
	
	public void foo() {
		try {
			int a[] = new int[2];
			a[4] = 1;	//下标越界，程序终止
			System.out.println("Method:foo"); 	////若异常发生，不执行
		}
		catch(ArrayIndexOutOfBoundsException e) {	//继续执行
			System.out.println("exception:"+e.getMessage());
		}
		finally {	//继续执行
			System.out.println("Finally block always execute!!!");
		}
	}

}
