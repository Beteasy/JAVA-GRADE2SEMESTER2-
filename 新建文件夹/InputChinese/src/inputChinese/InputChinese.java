package inputChinese;

public class InputChinese {

	public static void main(String[] args) {
		char ch1 = '��';
		int ch2 = '��';
		int count = 5;
		System.out.println("���5��ʯ���Եĺ���:");
		for(int i=(int)ch1;i<(int)ch1+count;i++){
			System.out.print((char)i+"("+i+")"+" ");
		}
		System.out.println();
		System.out.println("���5��Ů���Եĺ���:");
		for(int j=ch2; j<ch2+count; j++){
			System.out.print((char)j+"("+j+")"+" ");
		}

	}

}
