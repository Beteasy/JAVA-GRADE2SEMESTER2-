package equals_equalsIgnoreCase;

public class Equals_equalsIgnoreCase {
	public static void main(String[] argv) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = "abcd";
		String str4 = new String("abc");
		String str5 = new String("abc");
		String str6 = new String("ABCD");
		
		System.out.print(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals(str5));
		
		System.out.println(str3.equals(str6));
		System.out.println(str3.equalsIgnoreCase(str6));
		
		System.out.println(str1==str2);
		System.out.println(str1==str4);
		System.out.println(str1==str5);
		System.out.println(str4==str5);
	}

}
