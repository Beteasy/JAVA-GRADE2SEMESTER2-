package example_4;

public class Example6_4 {
	public static void main(String [] args) {
		int n=0, m=0, t=666;
		try {
			m=Integer.parseInt("888");
			n=Integer.parseInt("ab85");
			t=999;
		}
		catch(NumberFormatException e) {
			System.out.println("∑¢…˙“Ï≥£:"+e.getMessage());
			n=123;
		}
		System.out.println("n="+n+",m="+m+",t="+t);
	}
}
