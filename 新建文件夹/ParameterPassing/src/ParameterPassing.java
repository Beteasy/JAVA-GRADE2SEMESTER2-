
/*public class ParameterPassing {
	public int a = 10;
	public Integer b = 20;
	class myClass {
		int c;
	}
	myClass myObj;
	myObj.c = 30;
	void fun(int x, Integer y, myClass z) {
		x = 1;
		y = 2;
		z.c = 3;
		return;
	}
	fun(a,b,myObj);
	

}*/

public class ParameterPassing {
	public void func(int funInt, Integer funInteger, myClass funObj) {
		funInt = 1;
		funInteger = 1;
		funObj.obj = 1;
		return;
	}
	class myClass{
		int obj;
	}
	public static void main(String[] argv) {
		
		int myInt = 0;
		Integer myInteger = 0;
		myClass myObj;
		myObj.obj = 0;
		func(myInt,myInteger,myObj);
		System.out.println(myInt);
		System.out.println(myInteger);
		System.out.println(myObj.obj);
	}
	
}