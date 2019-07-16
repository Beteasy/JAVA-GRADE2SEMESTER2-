package shang_zhuan;

public class People extends Anthropoid{
	char m = 'A';
	int n = 60;
	void computer(int a , int b) {
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);
	}
	
	
	void crySpeak(String s) {		//重写的方法
		System.out.println(m + "**" + s + "**" + m);
	}
}
