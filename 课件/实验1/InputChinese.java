package ʵ��1;

public class InputChinese {

	public static void main(String[] args) {		
		char ch1='��', zifu=0;		//'��'Ϊʯ�ְ���1��������ַ�
	    int ch2='��', position=0;	//'��'ΪŮ�ְ���1��������ַ�
	    int count=5;
	    
	    // ��������Ӵ���
	    System.out.printf("���%d��ʯ���Եĺ���:\n",count); 
	    for(char c=ch1; c<ch1+count; c++) {
	    	position = (int)c;
	    	System.out.printf("%c(%d)  ", c, position); //c����int��ת�������㣬���������ֵ��position
	    }
	    System.out.println();
	    
	    System.out.printf("\n���%d��Ů���Եĺ���:\n",count);
	    for(int n=ch2; n<ch2+count; n++) {	 
	    	zifu = (char)n;
	    	System.out.printf("%c(%d)  ",zifu,n);	//n��char��ת�����㣬���������ֵ��zifu
	    }
	}
}
