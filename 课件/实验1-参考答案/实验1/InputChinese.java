package 实验1;

public class InputChinese {

	public static void main(String[] args) {		
		char ch1='研', zifu=0;		//'研'为石字傍第1个输出的字符
	    int ch2='好', position=0;	//'好'为女字傍第1个输出的字符
	    int count=5;
	    
	    // 在下面添加代码
	    System.out.printf("输出%d个石字旁的汉字:\n",count); 
	    for(char c=ch1; c<ch1+count; c++) {
	    	position = (int)c;
	    	System.out.printf("%c(%d)  ", c, position); //c进行int型转换据运算，并将结果赋值给position
	    }
	    System.out.println();
	    
	    System.out.printf("\n输出%d个女字旁的汉字:\n",count);
	    for(int n=ch2; n<ch2+count; n++) {	 
	    	zifu = (char)n;
	    	System.out.printf("%c(%d)  ",zifu,n);	//n做char型转换运算，并将结果赋值给zifu
	    }
	}
}
