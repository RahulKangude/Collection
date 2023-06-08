package cursors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Demoofclass {
public static void main(String[] args) {
	Vector v=new Vector();
	Enumeration e=v.elements();
	Iterator i=v.iterator();
	ListIterator l=v.listIterator();
	System.out.println("Enumeration class-->>"+e.getClass().getName());
	System.out.println(" Iterator class "+i.getClass().getName());
	System.out.println("ListIterator class -->>"+l.getClass().getName());
	System.out.println("vector class -->>"+v.getClass().getName());

}
}


