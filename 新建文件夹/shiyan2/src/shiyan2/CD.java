package shiyan2;

//CD.java表示光盘类，负责创建光盘对象。
public class CD {
	
	int[] content;	//int数组,表示光盘所存储的数据
	int size;	//表示数据大小，即：数组长度
	
	
	/*CD(){
		size = 8;
		content = new int[size];
		for(int i=0; i<size; i++) {
			content[i] = i+1;
		}
	}*/
	//设置CD的数据大小
		void setSize() {
			size = 8;
			content = new int[size];
		}
		void setSize(int newsize) {
			size = newsize;
			content = new int[size];
		}
	
	//获取CD的数据大小
	int getSize() {
		return size;
	}
	
	
	//设置光盘内容
		void setContent() {
			for(int i=0; i<size; i++) {	//原先这里数组越界
				content[i] = i+1;
			}
		}
		
		void setContent(int[] b) {
			for(int i=0; i<b.length; i++)
			{
				content[i] = b[i];
			}
		}
	
	//读取光盘内容
	int getContent(int[] content_com) {
		for(int i=0; /*i<content.length*/i<size; i++){
			content_com[i] = content[i];
		}
		return 0;
	}
}
