
public class StringToBasic {
	public static void main(String[] argv) {
		String strInt = "12345";
		String strFloat = "3.14159265359";
		String strBoolean = "False";
		System.out.println("�ַ������:");
		System.out.print(strInt+"+6789=");
		System.out.println(strInt+"6789");
		System.out.println("�ַ���ת��Ϊ���ֺ����:");
		System.out.print(strInt+"+6789=");
		System.out.println(Integer.parseInt(strInt)+6789);
		System.out.println("strFloatת��Ϊfloat");
		float PI = Float.parseFloat(strFloat);
		System.out.println("PI="+PI);
		System.out.print("2*PI=");
		System.out.println(2*PI);
		System.out.println("strFloatת��Ϊdouble");
		double PI2 = Double.parseDouble(strFloat);
		System.out.println("PI2="+PI2);
		System.out.print("2*PI2=");
		System.out.println(2*PI2);
		System.out.println(Boolean.parseBoolean(strBoolean));
	}
}