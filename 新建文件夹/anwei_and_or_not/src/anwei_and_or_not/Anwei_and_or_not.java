package anwei_and_or_not;

public class Anwei_and_or_not {
	public static void main(String args[]) {
		//��λ��
		byte a = 5;		//0101
		byte b = 4;		//0100
		int c = a|b;	//0101->5
		System.out.println(c);	//c=5
		
		//��λ��
		int d = a&b;	//0101&0100=0100->4
		System.out.println(d);
		
		//���ð�λ��ʵ�ִ�Сдת��
		char e = 'A';	//0100 0001
		int  f = 32;	//0010 0000
		char g = (char)(e|f);
		System.out.println(g);
		
		//���ð�λ��ȡһ������ĳλ����ĳ��λ
		int h = 123;
		int i = 1;
		System.out.println(h&i);
		
		//���ð�λ��ȡ2����123�ĺ���λ
		int j = 123;
		int k = 15;	//00001111
		System.out.println(j&k);	//���Ϊ11��˵��123�ĺ���λΪ1011
		
		//���ð�λ������x�ĺ���λΪ0
		int l = 123;	//0111011
		int m = -16;	//...0000
		System.out.println(l&m);	//112��2����Ϊ1110000
		
		//����ȡ����һ�������෴��
		int n = 5;
		n = ~n;
		n += 1;
		System.out.println(n);
	}

}
