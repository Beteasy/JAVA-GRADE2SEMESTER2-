package toString;

import java.util.Arrays;

public class toString {
	public static void main (String[] argv) {
		int intArray[] = new int[] {10, 20, 30, 40, 50};
		float floatArray[] = new float[] {1.2f, 3.6f, 5.7f, 4.9f};
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(floatArray));
	}

}
