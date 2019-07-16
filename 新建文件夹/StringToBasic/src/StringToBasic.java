
public class StringToBasic {
	public static void main(String[] argv) {
		String strInt = "12345";
		String strFloat = "3.14159265359";
		String strBoolean = "False";
		System.out.println("字符串相加:");
		System.out.print(strInt+"+6789=");
		System.out.println(strInt+"6789");
		System.out.println("字符串转换为数字后相加:");
		System.out.print(strInt+"+6789=");
		System.out.println(Integer.parseInt(strInt)+6789);
		System.out.println("strFloat转换为float");
		float PI = Float.parseFloat(strFloat);
		System.out.println("PI="+PI);
		System.out.print("2*PI=");
		System.out.println(2*PI);
		System.out.println("strFloat转换为double");
		double PI2 = Double.parseDouble(strFloat);
		System.out.println("PI2="+PI2);
		System.out.print("2*PI2=");
		System.out.println(2*PI2);
		System.out.println(Boolean.parseBoolean(strBoolean));
	}
}