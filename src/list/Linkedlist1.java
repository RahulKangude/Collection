
package list;

import java.util.LinkedList;

public class Linkedlist1 {
	public static void main(String[] args) {

		LinkedList<Object> l = new LinkedList();
//		l.add("Ram");
//		l.add(452.52f);
		
	    l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.set(4, 10);
	
		l.remove(2);
		System.out.println("before remove index 3 " + l);
		l.addFirst(568);
		l.addLast(1851);
		System.out.println("add first add last " + l);
		l.removeFirst();
		l.removeLast();
		System.out.println("remove first and last " + l);
	}
}
