package collection.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMap1 {
	public static void main(String[] args) {
		IdentityHashMap i = new IdentityHashMap();

		i.put(21, "Maharastra");
		System.out.println(i.put(21, "Gujarat"));
		i.put(1, "Keral");
		i.put(51, "Chennai");
		i.put(81, "Mumbai");
		
		Watch w1=new Watch(40);
		Watch w2=new Watch(40);
		Watch w3=new Watch(60);
		i.put(w1, "Ram");
		i.put(w2, "R");
		i.put(w3, "Hanuman");
		System.out.println(i);
		

	}
}

class Watch{
	int i;

	public Watch(int i) {
		super();
		this.i = i;
	}
	@Override
	public String toString() {

		return "i "+i;
	}
}