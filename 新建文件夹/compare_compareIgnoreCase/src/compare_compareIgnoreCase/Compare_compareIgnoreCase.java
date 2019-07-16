package compare_compareIgnoreCase;

public class Compare_compareIgnoreCase {
	public static void main(String[] argv) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = "abd";
		String str4 = "abf";
		String str5 = "ABC";
		String str6 = "abcd";
		String str7 = "abcdefg";
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str4));
		System.out.println(str1.compareTo(str5));
		System.out.println(str1.compareTo(str6));
		System.out.println(str1.compareTo(str7));
		System.out.println(str1.compareToIgnoreCase(str5));
	}

}
