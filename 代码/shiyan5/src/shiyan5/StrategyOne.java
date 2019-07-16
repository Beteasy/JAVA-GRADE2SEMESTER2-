package shiyan5;

import java.util.*;

public class StrategyOne implements GroupStrategy{

	@Override
	public void group(int n) {
		// TODO Auto-generated method stub
		LinkedList<Integer> listJiShu = new LinkedList<Integer>();
		LinkedList<Integer> listOuShu = new LinkedList<Integer>();
		Iterator<Integer> iterJiShu;
		Iterator<Integer> iterOuShu;
		
		for(int i=1; i<=n; i++) {
			if(i%2 == 0) {
				listJiShu.add(i);
			}
			else {
				listOuShu.add(i);
			}
		}
		iterJiShu = listJiShu.iterator();
		iterOuShu = listOuShu.iterator();
		System.out.println("��1-"+n+"����ż���ֳ�����:");
		System.out.print("ż����:");
		while(iterJiShu.hasNext()) {
			System.out.printf("%5d",iterJiShu.next());
		}
		System.out.println("");
		System.out.print("������:");
		while(iterOuShu.hasNext()) {
			System.out.printf("%5d",iterOuShu.next());
		}
		System.out.println("");

	}

	
}
