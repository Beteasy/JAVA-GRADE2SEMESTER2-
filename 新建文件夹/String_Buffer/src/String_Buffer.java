
public class String_Buffer {
	public static void main(String[] argv) {
		StringBuffer strBuff = new StringBuffer("A string");
		System.out.println(strBuff.toString());
		
		strBuff.insert(strBuff.length(), " is");
		System.out.println(strBuff.toString());
		
		strBuff.append(" an array");
		System.out.println(strBuff.toString());
		
		strBuff.insert(11, " not");
		System.out.println(strBuff.toString());
		
		strBuff.setCharAt(2, 'S');
		System.out.println(strBuff.toString());
		
		strBuff.replace(2, 15, "China");
		System.out.println(strBuff.toString());
		
		strBuff.deleteCharAt(2);
		System.out.println(strBuff.toString());
		
		strBuff.delete(2, 6);
		System.out.println(strBuff.toString());
		
		strBuff.reverse();
		System.out.println(strBuff.toString());
		
		System.out.println("the length of str is :" + strBuff.length());
		System.out.println("the size of the area is :" + strBuff.capacity());
	}

}
