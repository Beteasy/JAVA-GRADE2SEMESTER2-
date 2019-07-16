package sort;

import java.util.Arrays;

public class Sort {
	public static void main(String[] argv) {
		int intArray[] = new int[] {67,23,90,56,78,72,8,100,88};
		int intArray2[] = Arrays.copyOf(intArray, intArray.length);
		int intArray3[] = Arrays.copyOf(intArray, intArray.length);
		System.out.println(Arrays.toString(intArray));
		Arrays.sort(intArray2);
		System.out.println(Arrays.toString(intArray2));
		Arrays.sort(intArray3, 2,8);
		System.out.println(Arrays.toString(intArray3));
	}

}
