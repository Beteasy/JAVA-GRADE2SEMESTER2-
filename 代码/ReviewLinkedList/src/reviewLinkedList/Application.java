package reviewLinkedList;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Worker> list = new LinkedList<Worker>();
		
		Worker zhang3 = new Worker("zhang3",18,3000);
		Worker li4 = new Worker("li4",25,3500);
		Worker wang5 = new Worker("wang5",22,3200);
		Worker zhao6 = new Worker("zhao6",24,3300);
		
		list.add(zhang3);
		list.add(li4);
		list.add(wang5);
		
		int index = list.indexOf(li4);
		list.add(index,zhao6);
		
		list.remove(wang5);
		Iterator<Worker> iter = list.iterator();
		Worker temp;
		while(iter.hasNext()) {
			temp = iter.next();
			System.out.println(temp.getName()+" "+temp.getAge()+" "+temp.getSalary());
			temp.work();
		}
		
		System.out.print(list.get(2).getName()+list.get(2).getAge()+list.get(2).getSalary());
	}

}
