
package set;

import java.util.Comparator;
import java.util.TreeSet;

public class CustDemo {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>(new Fast());
		t.add("Rahul");
		t.add("Suresh");
		t.add("Kangude");
		t.add("Visapur");
		t.add("Shrigondha");
		t.add("Ahmednagar");
		t.add("Ahfjjcxar");
		t.add("Ajjcxar");
		System.out.println(" customized sorting  order-->> " + t);
	}
}
class Fast implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1.toString();
		String s2=(String)o2.toString();
		return -s1.compareTo(s2);
	}

	

	
	}


