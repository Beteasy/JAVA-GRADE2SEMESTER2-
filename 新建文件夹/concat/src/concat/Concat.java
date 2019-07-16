package concat;

public class Concat {
	public static void main(String[] argv) {
	String myString1 = "Hellow";
	String myString2 = "World";
	String myString3 = myString1.concat(myString2);
	String myString4 = myString2.concat(myString1);
	System.out.println(myString1);
	System.out.println(myString2);
	System.out.println(myString3);
	System.out.println(myString4);
}

}
