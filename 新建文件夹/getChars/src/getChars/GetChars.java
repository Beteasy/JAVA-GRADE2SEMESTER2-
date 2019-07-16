package getChars;

import java.util.Arrays;

public class GetChars {
	public static void main(String[] argv) {
		String str = "I am a Chinese. And I love China!";
		char chArray[] = str.toCharArray();
		chArray[2] = 'A';
		System.out.println(chArray);
		Arrays.fill(chArray, '-');
		System.out.println(chArray);
		str.getChars(7, 14, chArray, 3);
		System.out.println(chArray);
	}


}
