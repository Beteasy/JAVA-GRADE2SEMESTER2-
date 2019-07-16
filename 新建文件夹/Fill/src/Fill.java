import java.util.Arrays;

public class Fill {
	public static void main(String[] argv) {
		int intArray[] = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		Arrays.fill(intArray, 4, 7, 88);
		System.out.println(Arrays.toString(intArray));
		Arrays.fill(intArray, 66);
		System.out.println(Arrays.toString(intArray));
	}

}
