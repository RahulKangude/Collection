package list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo1 {
	public static void main(String[] args) {
		Vector  v = new Vector<Integer>();
		v.add(56);
		v.add(5);
		v.add(46);
		v.add(86);
		v.add(96);
		v.add(51);
		v.add("RAHUL");
		v.remove(3);
		System.out.println(v);
//	 System.out.println("capacity-->>    "+v.capacity());
//	System.out.println("last elements-->>"+ v.lastElement());
//	 System.out.println(v+"\n");
//	 System.out.println("by Enumearation ");
//	 Enumeration e=v.elements();
//	 while(e.hasMoreElements()) {
//		 Integer it=(Integer) e.nextElement();
//		 System.out.println(it);
//		 v.remove(e);
//		 System.out.println(it);
//	 }
//	 
//	 System.out.println("by foreach loop");
//	 for(int i=0;i<v.size();i++) {
//		 System.out.println(v.elementAt(i));
//	 }
//	 
//	 System.out.println("by foreach loop");
//	 for(int arr:v) {
//		 System.out.println(arr);
//	 }
//	 
//	 System.out.println("by Iterator ");
//	 Iterator itr=v.iterator();
//	 while(itr.hasNext()) {
//		 Integer r=(Integer) itr.next();
//		 System.out.println(r);
//	 }

//		System.out.println("by List iterator forward direction ");
//		ListIterator list = v.listIterator();
//
//		while (list.hasNext()) {
//			Integer i1 = (Integer) list.next();
//			if (i1.equals(96)) {
//				list.remove();
//			} else if (i1.equals(5)) {
//				list.add(5000);
//			} else if (i1.equals(51)) {
//				list.set(1110);
//			}
//		}
//		System.out.println(v);
//
//		System.out.println("by List iterator res direction ");
//		ListIterator rev = v.listIterator();
//
//		while (list.hasPrevious()) {
//			Integer i1 = (Integer) list.previous();
//			if (i1.equals(46)) {
//				list.remove();
//			} else if (i1.equals(5)) {
//				list.add(5555);
//			} else if (i1.equals(86)) {
//				list.set(222);
//			}
//		}
//		System.out.println(v);
//
	}
	}
