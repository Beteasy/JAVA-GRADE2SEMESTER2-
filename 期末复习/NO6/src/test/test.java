package test;

import mypackage.Compute;

public class test {
	public static void main(String args[]) {
		Compute com1 = new Compute(1,2);
	
		Compute com2 = new Compute(com1.sum(),3);
		System.out.println(com2.multi());
	}
}
