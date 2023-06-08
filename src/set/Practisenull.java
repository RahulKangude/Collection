package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.Stack;

public class Practisenull {
  public static void main(String[] args) {
	HashSet h=new HashSet();
	HashSet h1=new HashSet();
	h1.add(15);
	h1.add(89);


	h.add(89);
	h.add(15);
	h.add(16);
	h.add(19);
	h.add(17);
	h.add(74);
	h.add(99);
	System.out.println("hasgset1 --"+h);
	System.out.println("hasgset2 --"+h1);
//	System.out.println(h.contains(988));
//	System.out.println(h.equals(h1));
//	System.out.println(h);
//    int a=h1.hashCode();
//	System.out.println(a);
	
	ArrayList A=new ArrayList();
	A.add(10);
	A.add(17);
	A.add(19);
	A.add(11);
	A.add(16);
	System.out.println(A.subList(0, 3));
	
	
	ListIterator z=A.listIterator(1);
	//System.out.println(z );
	
	
	
	
	Object arr[] =h.toArray();//convert into array
	System.out.println(Arrays.toString(arr));

}
}
