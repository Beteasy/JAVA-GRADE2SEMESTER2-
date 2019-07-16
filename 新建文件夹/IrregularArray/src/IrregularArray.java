
public class IrregularArray {
	public static void main(String[] argv) {
		int Array[][] = new int[][] {
			{77,45,86,62,90},
			{87,67,93},
			{78,89},
			{76,81,79,90},
		};
		int row, col;
		for(row = 0; row < Array.length; row ++) {
			float sum = 0.0f;
			float average = 0.0f;
			for(col = 0; col <Array[row].length; col ++) {
				if(Array[row][col] >= 90) {
					System.out.println("the good students of class" + (row+1) + "are:");
					System.out.println("num:" + (col+1) + " score:" + Array[row][col]);
				}
				sum += Array[row][col];
				average = sum / Array[row].length;
			}
			System.out.println("the average socre of class" + (row+1) + "is: " + average);
		}
	}


}
