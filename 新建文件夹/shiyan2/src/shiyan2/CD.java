package shiyan2;

//CD.java��ʾ�����࣬���𴴽����̶���
public class CD {
	
	int[] content;	//int����,��ʾ�������洢������
	int size;	//��ʾ���ݴ�С���������鳤��
	
	
	/*CD(){
		size = 8;
		content = new int[size];
		for(int i=0; i<size; i++) {
			content[i] = i+1;
		}
	}*/
	//����CD�����ݴ�С
		void setSize() {
			size = 8;
			content = new int[size];
		}
		void setSize(int newsize) {
			size = newsize;
			content = new int[size];
		}
	
	//��ȡCD�����ݴ�С
	int getSize() {
		return size;
	}
	
	
	//���ù�������
		void setContent() {
			for(int i=0; i<size; i++) {	//ԭ����������Խ��
				content[i] = i+1;
			}
		}
		
		void setContent(int[] b) {
			for(int i=0; i<b.length; i++)
			{
				content[i] = b[i];
			}
		}
	
	//��ȡ��������
	int getContent(int[] content_com) {
		for(int i=0; /*i<content.length*/i<size; i++){
			content_com[i] = content[i];
		}
		return 0;
	}
}
