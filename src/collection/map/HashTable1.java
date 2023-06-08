package collection.map;

import java.util.Hashtable;

public class HashTable1 {
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(new Tempoo(15), "A");
		h.put(new Tempoo(18), "B");
		h.put(new Tempoo(20), "C");
		h.put(new Tempoo(19), "D");
		h.put(new Tempoo(23), "E");
		h.put(new Tempoo(16), "F");
		h.put(new Tempoo(16), "R");
		// h.put(new Tempoo(null),"G");//NULL pointer exception
		System.out.println(h);
		System.out.println();
	}
}

class Tempoo {
	int i;

	Tempoo(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		return i;
	}

	public String toString() {
		return i + "";
	}

}