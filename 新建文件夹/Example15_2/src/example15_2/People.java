package example15_2;

public class People extends Thread{
	StringBuffer str;
	People(String s,StringBuffer str){
		setName(s);		//���ô�Thread��̳е�setName����Ϊ�߳�������
		this.str = str;
	}
	
	public void run() {
		for(int i=1; i<=3; i++) {
			str.append(getName()+",");		//����ǰ�̵߳�����׷�ӵ�str
			System.out.println("����"+getName()+"���ַ���Ϊ"+str);
			/*try {
				sleep(200);
			}
			catch(InterruptedException e) {
				
			}*/
		}
	}
}
