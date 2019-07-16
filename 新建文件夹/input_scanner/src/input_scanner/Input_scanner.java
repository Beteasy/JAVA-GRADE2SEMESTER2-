package input_scanner;

import java.util.Scanner;

public class Input_scanner {
	public static void main(String args[]) {
		System.out.println("enter");
		Scanner reader = new Scanner(System.in);
		double sum = 0;
		int m = 0;
		double x = reader.nextDouble();
		while(x!=0) {
			sum += x;
			m += 1;
			x = reader.nextDouble();
		}
		reader.close();	//remember
		System.out.println("the sum is:" + sum);
		System.out.println("the average is:" + sum/m);
	}

}
