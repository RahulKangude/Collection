package collection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap l = new LinkedHashMap();
		l.put(10, 'A');
		l.put(11, 'b');
		l.put(12, 'B');
		l.put(13, 'C');
		l.put(14, 'D');
		l.put(null, 'D');
		l.put(0, 456);
		l.put('x', 'D');
//	l.replace(12, 'Z');
//	l.replace('x', 45);
		System.out.println(l);

		Set q = l.entrySet();
		Iterator itr = q.iterator();
		while (itr.hasNext()) {
			Map.Entry e = (Entry) itr.next();
			System.out.println(e);
		}

	}
}
