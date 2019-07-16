package binarySearch;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] argv) {
		int intArray[] = new int[] {10,23,34,45,56,56,78,89,90,100};
		System.out.println(Arrays.binarySearch(intArray, 45));
		System.out.println(Arrays.binarySearch(intArray, 2,6,56));
		System.out.println(Arrays.binarySearch(intArray, 2,6,66));
		System.out.println(Arrays.binarySearch(intArray, 99));
	}

}
