package splitNum;

import java.util.Scanner;

public class SplitNum {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int num;
		num = reader.nextInt();
		int a[] = new int[10];
		int i=0;
		while(num>0) {
			a[i] = num % 10;
			num = num / 10;
			i++;
		}
		for(int n=i-1; n>=0; n--) {
			System.out.println(a[n]);
		}
		
		reader.close();
	}

}
