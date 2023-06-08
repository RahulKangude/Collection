
package collection.map;

import java.util.WeakHashMap;

public class WeakHashMap1 {
	public static void main(String[] args) throws InterruptedException {

		WeakHashMap W = new WeakHashMap();
//		HashMap W=new HashMap();
		Tempo t = new Tempo();
		W.put(t, "Rahul");
		W.put(t, "pranav");
		W.put(100, "sam");// it remove only unrefraence object
		W.put(101, "Ram");
		System.out.println("before gc" + W);
		t = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println("after gc " + W);

	}
}

class Tempo {

	@Override
	public String toString() {
		return "t";
	}

}