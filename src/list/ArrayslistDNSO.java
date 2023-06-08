package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayslistDNSO {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("R");
		l.add("A");
		l.add("H");
		l.add("U");
		l.add("L");
  	l.add(new Integer(10));//it get classcastException when comparing the elements
	l.add(null);//null pointer Exception
	System.out.println("before sort"+l);
//	Collections.sort(l);
//	System.out.println("after sort"+l);
	}
}
