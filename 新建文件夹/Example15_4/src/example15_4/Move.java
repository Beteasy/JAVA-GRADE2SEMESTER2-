package example15_4;

public class Move implements Runnable{
	StringBuffer str = new StringBuffer();		//全局变量
	public void run() {
		String name = Thread.currentThread().getName();		
		//StringBuffer str = new StringBuffer();		//局部变量
		for(int i=1; i<=3; i++) {
			if(name.equals("张三")) {
				str.append(name);
				System.out.println(name+"线程的局部变量i="+i+",str="+str);
			}
			else if(name.equals("李四")) {
				str.append(name);
				System.out.println(name+"线程的局部变量i="+i+",str="+str);
			}
			try {
				Thread.sleep(800);
			}
			catch(InterruptedException e) {}
		}
	}
}
