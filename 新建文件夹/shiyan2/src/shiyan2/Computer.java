package shiyan2;


//Computer.java��ʾ��һ�������ļ�����࣬Computer�ฺ�𴴽����������
public class Computer {
	
	int[] data;	//��ʾComputer��Ӳ��
	//CD includeCD = new CD();	//��������ΪCD�࣬��ʾComputer��CD
	CD includeCD;
	
	/*Computer(CD cd){
		includeCD = cd;
	}*/
	
	//ģ�⽫CD����Computer
	void putCD(CD cd) {
		includeCD = cd;
	}
	
	//ģ�⽫CD�ϵ����ݸ��Ƶ�Ӳ��
	void copyToComputer(){
		data = new int[includeCD.getSize()];
		includeCD.getContent(data);
	}
	
	//ģ�⽫Ӳ���е�ÿ�����ݵ�ֵ����m
	void addData(int m){
		for(int i=0; i<data.length; i++){
			data[i] += m;
		}
	}
	
	//d)ģ�⽫�洢��Computer������д��CD
	void copyToCD(/*int[] content_cd*/){
		/*for(int i=0; i<data.length; i++)
		{
			content_cd[i] = data[i];
		}*/
		includeCD.setContent(data);
	}
	
	//e)��ʾ�洢��data����������(showData(��))��
	void showData(){
		for(int i=0; i<data.length; i++) {
			System.out.print(" "+data[i]);
		}
	}
}
