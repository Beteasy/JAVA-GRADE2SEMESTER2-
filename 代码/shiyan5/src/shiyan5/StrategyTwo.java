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
				listZero.add(i);	//�Զ�װ��
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
		
		System.out.println("��1-"+n+"��3����ֳ�����:");
		System.out.printf("��3��������:");
		while(iterZero.hasNext()) {
			System.out.printf("%5d",iterZero.next());
		}
		System.out.println("");
		System.out.printf("��3����1����:");
		while(iterOne.hasNext()) {
			System.out.printf("%5d",iterOne.next());
		}
		System.out.println("");
		System.out.printf("��3����2����:");
		while(iterTwo.hasNext()) {
			System.out.printf("%5d",iterTwo.next());
		}
	}
	
	
}
