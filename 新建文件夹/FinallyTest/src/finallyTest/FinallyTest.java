package finallyTest;

/*
 * ϵͳ�׳��쳣�󣬲����쳣������finally�飬�������м�����
 */

public class FinallyTest {

	public static void main(String[] args) /*throws ArrayIndexOutOfBoundsException*/ {
		// TODO Auto-generated method stub
		FinallyTest t = new FinallyTest();
		t.foo();	//��try-catch�������쳣
		System.out.println("Excecution after Exception!!!");	//����ִ��
	}
	
	public void foo() {
		try {
			int a[] = new int[2];
			a[4] = 1;	//�±�Խ�磬������ֹ
			System.out.println("Method:foo"); 	////���쳣��������ִ��
		}
		catch(ArrayIndexOutOfBoundsException e) {	//����ִ��
			System.out.println("exception:"+e.getMessage());
		}
		finally {	//����ִ��
			System.out.println("Finally block always execute!!!");
		}
	}

}
