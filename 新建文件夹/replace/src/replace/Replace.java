package replace;

public class Replace {
	public static void main(String[] argv) {
		String str = "i am a chinese. and i love china";
		System.out.println(str.replace("i", "I"));
		System.out.println(str.replace("ch", "CH"));
		System.out.println(str.replaceAll("ch", "CH"));
		System.out.println(str.replaceFirst("ch", "CH"));
		System.out.println(str.replaceFirst("chinese", "CH"));
	}

}
