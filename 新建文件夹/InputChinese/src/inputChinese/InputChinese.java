package inputChinese;

public class InputChinese {

	public static void main(String[] args) {
		char ch1 = '研';
		int ch2 = '好';
		int count = 5;
		System.out.println("输出5个石字旁的汉字:");
		for(int i=(int)ch1;i<(int)ch1+count;i++){
			System.out.print((char)i+"("+i+")"+" ");
		}
		System.out.println();
		System.out.println("输出5个女字旁的汉字:");
		for(int j=ch2; j<ch2+count; j++){
			System.out.print((char)j+"("+j+")"+" ");
		}

	}

}
