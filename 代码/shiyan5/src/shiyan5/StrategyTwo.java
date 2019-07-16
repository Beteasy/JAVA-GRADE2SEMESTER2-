package shiyan5;

import java.util.*;

public class StrategyTwo implements GroupStrategy{
	LinkedList<Integer> listZero = new LinkedList<Integer>();
	LinkedList<Integer> listOne = new LinkedList<Integer>();
	LinkedList<Integer> listTwo = new LinkedList<Integer>();
	Iterator<Integer> iterZero;
	Iterator<Integer> iterOne;
	Iterator<Integer> iterTwo;
	
	@Override
	public void group(int n) {
		// TODO Auto-generated method stub
		for(int i=1; i<=n; i++) {
			if(i%3 == 0) {
				listZero.add(i);	//自动装箱
			}
			else if(i%3 == 1) {
				listOne.add(i);
			}
			else {
				listTwo.add(i);
			}
		}
		iterZero = listZero.iterator();
		iterOne = listOne.iterator();
		iterTwo = listTwo.iterator();
		
		System.out.println("将1-"+n+"用3求余分成三组:");
		System.out.printf("被3除尽的组:");
		while(iterZero.hasNext()) {
			System.out.printf("%5d",iterZero.next());
		}
		System.out.println("");
		System.out.printf("被3除余1的组:");
		while(iterOne.hasNext()) {
			System.out.printf("%5d",iterOne.next());
		}
		System.out.println("");
		System.out.printf("被3除余2的组:");
		while(iterTwo.hasNext()) {
			System.out.printf("%5d",iterTwo.next());
		}
	}
	
	
}
