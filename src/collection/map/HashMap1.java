package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap m = new HashMap();

		System.out.println(m.put(100, "pranav"));
		System.out.println(m.put(101, "rahul"));
		System.out.println(m.put(102, "Om"));
		System.out.println(m.put(103, "Vaibhav"));
		System.out.println(m.put(102, "Rushi"));
		System.out.println(m);
		Set h = m.keySet();
		System.out.println("All keySet value-->>" + h);
		Collection s = m.values();
		System.out.println("all values " + s);
		Set Q = m.entrySet();
		System.out.println(Q);
		Iterator itr = Q.iterator();
		while (itr.hasNext()) {
			Map.Entry M = (Entry) itr.next();
			// System.out.println(M.getKey()+"--"+M.getValue());
			if (M.getKey().equals(101)) {
				M.setValue(1000);
			}
			System.out.println(M);
		}

	}
}
