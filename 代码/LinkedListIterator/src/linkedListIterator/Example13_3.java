package linkedListIterator;

import java.util.*;

public class Example13_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();
		for(int i=0; i<=60096; i++) {
			list.add("speed"+ i);
		}
		Iterator<String> iter = list.iterator();
		long startTime = System.currentTimeMillis(); 
		while(iter.hasNext()) {
			String te = iter.next();
		}
		long endTime = System.currentTimeMillis();
		long result = endTime-startTime;
		System.out.println("itet:"+result);
	}

}
