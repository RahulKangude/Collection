package collection.method;

import java.util.ArrayList;
import java.util.Collection;

public class Methods {
	public static void main(String[] args) {
		ArrayList n = new ArrayList();
		ArrayList d = new ArrayList(n);
//		d.add(11);
		n.add(10);
		n.add(12);
	System.out.println(n.hashCode());
	
		
//		// n.addAll(1, n);
//		n.add(82);
//		n.add(7);
//		n.add(14);
//		n.removeAll(d);
		// n.retainAll(d);
		// n.clear();
//		System.out.println(n.containsAll(d));
//		System.out.println(n.isEmpty());
//		System.out.println(n.get(4));
//		System.out.println(n.size());
//		System.out.println(n);
        System.out.println(n.equals(d));
		String s = n.toString();


	}
}
