package shiyan2;


//Computer.java表示有一个光驱的计算机类，Computer类负责创建计算机对象
public class Computer {
	
	int[] data;	//表示Computer的硬盘
	//CD includeCD = new CD();	//数据类型为CD类，表示Computer的CD
	CD includeCD;
	
	/*Computer(CD cd){
		includeCD = cd;
	}*/
	
	//模拟将CD放入Computer
	void putCD(CD cd) {
		includeCD = cd;
	}
	
	//模拟将CD上的数据复制到硬盘
	void copyToComputer(){
		data = new int[includeCD.getSize()];
		includeCD.getContent(data);
	}
	
	//模拟将硬盘中的每个数据的值增加m
	void addData(int m){
		for(int i=0; i<data.length; i++){
			data[i] += m;
		}
	}
	
	//d)模拟将存储在Computer的数据写入CD
	void copyToCD(/*int[] content_cd*/){
		/*for(int i=0; i<data.length; i++)
		{
			content_cd[i] = data[i];
		}*/
		includeCD.setContent(data);
	}
	
	//e)显示存储在data的数据内容(showData(…))等
	void showData(){
		for(int i=0; i<data.length; i++) {
			System.out.print(" "+data[i]);
		}
	}
}
