package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(40, "Ram");
		h.put(5, "Sita");
		h.put(80, "Laxman");
		h.put(60, "Hanuman");
		h.put(70, "Mahadev");
		System.out.println(h);
		Set<?> Q = h.entrySet();

		Iterator<?> ir = Q.iterator();

		while (ir.hasNext()) {
			// System.out.println(ir.next());
			Map.Entry e = (Entry) ir.next();
			// System.out.println(e.getValue());
			if (e.getKey().equals(5)) {
				e.setValue(4512);
			}
			System.out.println(e);
		}

	}
}
