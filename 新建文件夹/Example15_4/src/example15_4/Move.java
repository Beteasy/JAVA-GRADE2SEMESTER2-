package example15_4;

public class Move implements Runnable{
	StringBuffer str = new StringBuffer();		//ȫ�ֱ���
	public void run() {
		String name = Thread.currentThread().getName();		
		//StringBuffer str = new StringBuffer();		//�ֲ�����
		for(int i=1; i<=3; i++) {
			if(name.equals("����")) {
				str.append(name);
				System.out.println(name+"�̵߳ľֲ�����i="+i+",str="+str);
			}
			else if(name.equals("����")) {
				str.append(name);
				System.out.println(name+"�̵߳ľֲ�����i="+i+",str="+str);
			}
			try {
				Thread.sleep(800);
			}
			catch(InterruptedException e) {}
		}
	}
}
