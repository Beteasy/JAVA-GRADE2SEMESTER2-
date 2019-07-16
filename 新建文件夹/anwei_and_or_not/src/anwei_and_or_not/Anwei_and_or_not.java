package anwei_and_or_not;

public class Anwei_and_or_not {
	public static void main(String args[]) {
		//按位或
		byte a = 5;		//0101
		byte b = 4;		//0100
		int c = a|b;	//0101->5
		System.out.println(c);	//c=5
		
		//按位与
		int d = a&b;	//0101&0100=0100->4
		System.out.println(d);
		
		//利用按位或实现大小写转换
		char e = 'A';	//0100 0001
		int  f = 32;	//0010 0000
		char g = (char)(e|f);
		System.out.println(g);
		
		//利用按位与取一个数的某位或者某几位
		int h = 123;
		int i = 1;
		System.out.println(h&i);
		
		//利用按位与取2进制123的后四位
		int j = 123;
		int k = 15;	//00001111
		System.out.println(j&k);	//结果为11，说明123的后四位为1011
		
		//利用按位与设置x的后四位为0
		int l = 123;	//0111011
		int m = -16;	//...0000
		System.out.println(l&m);	//112的2进制为1110000
		
		//利用取反求一个数的相反数
		int n = 5;
		n = ~n;
		n += 1;
		System.out.println(n);
	}

}
