
public class String_Search {
	public static void main(String[] argv) {
		String str = "This website named Programming Panda is created by Mr.John.The URL is www.mrjohn.ml.";
		String str2 = "john";
		String str3 = "ram";
		System.out.println(str.charAt(16));
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("P", 16));
		System.out.println(str.indexOf(str2));
		System.out.println(str.indexOf(str3,20));
		System.out.println(str.lastIndexOf("P"));
		System.out.println(str.lastIndexOf("m",19));
		System.out.println(str.lastIndexOf(str3));
		System.out.println(str.lastIndexOf(str3,76));
	}

}
