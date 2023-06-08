package set;

import java.util.Comparator;
import java.util.TreeSet;

public class Vaibhav {
	public static void main(String[] args) {
//	HashSet t=new HashSet((Collection) new Arvind());
		TreeSet t = new TreeSet(new Arvind());
		t.add(5);
		t.add(1);
		t.add(56);
		t.add(6);
		t.add(2);
		System.out.println(t);

	}
}

class Arvind implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;
		return -I2.compareTo(I1);
	}

}