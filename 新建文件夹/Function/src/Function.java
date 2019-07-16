class Obj{
	private int var1;
	private static int var2;
	/*public void Obj() {
		var1 = 0;
		var2 = 0;
	}*/
	public void setvar1(int var) {
		var1 = var;
		return;
	}
	public int getvar1() {
		return var1;
	}
	public void setvar2(int var) {
		var2 = var;
		return;
	}
	public int getvar2() {
		return var2;
	}
	public void printObj() {
		System.out.println("Obj: the var1 is: " + var1);
		System.out.println("Obj: the var2 is: " + var2);
		return;
	}
}
public class Function {
	private static void func(int fvar, Obj fObj) {
		System.out.println("function begin:");
		System.out.println("the var in func is :" + fvar);
		System.out.println("the var1 of Obj in fun is:" + fObj.getvar1());
		System.out.println("the var2 of Obj in fun is:" + fObj.getvar2());
		
		fvar = fvar * 2;
		fObj.setvar1(fObj.getvar1()*2);
		fObj.setvar2(fObj.getvar2()*2);
		System.out.println("function end");
		return;
	}
	
	public static void main(String[] argv) {
		System.out.println("mian function begin");
		int var = 0;
		Obj obj1 = new Obj();
		Obj obj2 = new Obj();
		
		var = 1;
		obj1.setvar1(3);
		obj1.setvar2(5);
		obj2.setvar1(7);
		System.out.println("the var1 of obj2 is :" + obj2.getvar1());
		System.out.println("the var2 of obj2 is :" + obj2.getvar2());
		
		func(var,obj1);
		
		System.out.println("after call the functionn:");
		System.out.println("the var is:" + var);
		System.out.println("the var1 of obj1 is :" + obj1.getvar1());
		System.out.println("the var2 of obj1 is :" + obj1.getvar2());
		
		System.out.println("the var1 of obj2 is :" + obj2.getvar1());
		System.out.println("the var2 of obj2 is :" + obj2.getvar2());
	}

}
