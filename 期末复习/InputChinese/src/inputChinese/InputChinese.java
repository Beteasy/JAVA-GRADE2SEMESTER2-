package inputChinese;

public class InputChinese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = '研';
		int ch2 = '好';
		int count = 5;
		
		System.out.println("输出5个石字旁的汉字:");
		for(char ch=ch1; ch<ch1+count; ch++) {
			System.out.print(ch+"("+(int)ch+")  ");
		}
		
		System.out.println();
		System.out.println("输出5个女字旁的汉字:");
		for(int i=ch2; i<ch2+count; i++) {
			System.out.print((char)i+"("+i+")");
		}
	}
}
