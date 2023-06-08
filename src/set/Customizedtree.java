package set;

import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;

public class Customizedtree {
  public static void main(String[] args) {
	TreeSet<Integer> t=new TreeSet<Integer>(new TreeDemo());
	t.add(14);
	System.out.println("original elements list "+t);
	t.add(5);
	System.out.println("original elements list "+t);
	t.add(100);
	System.out.println("original elements list "+t);
	t.add(9);
	System.out.println("original elements list "+t);
	t.add(4);
	System.out.println("original elements list "+t);
	t.add(289);
	System.out.println("original elements list "+t);
	t.add(1);
	System.out.println("original elements list "+t);
}
}
class TreeDemo implements Comparator{

	public int compare(Object Obj1, Object Obj2) {
	Integer I1=(Integer) Obj1;
	Integer I2=(Integer) Obj2;
	
	
 
	if (I1<I2) {
		return -1; 
	}
	if (I1>I2) {
		return +1; 
	}
	else
	return 0;
	}
	
}
