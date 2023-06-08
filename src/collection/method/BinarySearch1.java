package collection.method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BinarySearch1 {
  public static void main(String[] args) {
	ArrayList l=new ArrayList();
	l.add(45);
	l.add(78);
	l.add(4);
	l.add(5);
	l.add(25);
	System.out.println(l);
	Collections.sort(l);
	System.out.println(l);
	System.out.println("size "+l.size());
	System.out.println("sucessfull search retrun index-->>"+Collections.binarySearch(l, 45));
	System.out.println("unsucessfull search retrun Insetion ponit-->>"+Collections.binarySearch(l, 45));
	System.out.println("unsucessfull search retrun Insetion ponit 100 -->>"+Collections.binarySearch(l, 100, new MyDemo()));
}
}

class MyDemo implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		return i1.compareTo(i2);
	}
	
}