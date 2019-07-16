package copy;

import java.util.Arrays;

public class Copy {
	public static void main(String[] argv) {
		int intArray[] = new int[] {10,20,30,40,50,60,70,80,90,100};
		int intArray2[];
		
		intArray2 = Arrays.copyOf(intArray,5);
		System.out.println(Arrays.toString(intArray2));
		
		intArray2 = Arrays.copyOf(intArray,10);
		System.out.println(Arrays.toString(intArray2));
		
		intArray2 = Arrays.copyOf(intArray, 15);
		System.out.println(Arrays.toString(intArray2));
		
		intArray2 = Arrays.copyOfRange(intArray, 3, 8);
		System.out.println(Arrays.toString(intArray2));
	}

}