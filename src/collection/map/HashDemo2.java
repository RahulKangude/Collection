package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashDemo2 {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		HashMap h1 = new HashMap();

		h1.put(96, "Vaibhav");
		h1.put(18, "Vaibhav");

		h.put(45, "Vaibhav");
		h.put(14, "Vaibhav");
		h.put("cdcd", 415);
		h.put(null, "Rahul");
	
		h.putAll(h1);
		System.out.println(h);
	System.out.println(h.entrySet());
	System.out.println(h.keySet());
	System.out.println(h.values());

		
		
		System.out.println(h.get(96));
		h.remove(18, "Vaibhav");
     	//h.clear();
		HashMap hs = (HashMap) h.clone();
		System.out.println(hs);
		System.out.println(h.containsKey(4));
		System.out.println(h.containsValue("Rahul"));
		System.out.println(h.isEmpty());
		System.out.println(h.size());
	}
}
