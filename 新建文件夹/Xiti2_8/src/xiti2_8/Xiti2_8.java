package xiti2_8;

public class Xiti2_8 {

	public static void main(String[] args) {
		double a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		double b[][] = {{1.0,2.2,3.3,4.4},{5.5,6.6,7.7,8.8}};
		
		boolean boo = (a[0]==b[0]);
		System.out.println(boo);	//false
		
		boo = (a[0][0]==b[0][0]);
		System.out.println(boo);	//T
		
		a[0] = b[0];
		a[1] = b[1];
		System.out.println(a==b);	//T->F
		System.out.println(a.length);	//2->3
		System.out.println(a[0][3]);	//4.4
		System.out.println(a[1][3]);	//8.8
		

	}

}
