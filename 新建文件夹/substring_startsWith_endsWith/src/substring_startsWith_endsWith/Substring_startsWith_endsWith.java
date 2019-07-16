package substring_startsWith_endsWith;

public class Substring_startsWith_endsWith {
	public static void main(String[] argv) {
		String str = "welcometotheworldofjava";
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 8));
		System.out.println(str.startsWith("wel"));
		System.out.println(str.startsWith("wec"));
		System.out.println(str.startsWith("com",3));
		System.out.println(str.endsWith("java"));
	}

}
