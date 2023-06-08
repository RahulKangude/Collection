package collection.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;
public class TreeSetCustomized {
   public static void main(String[] args) {
	   TreeMap<StringBuffer,Integer>sb=new TreeMap<StringBuffer,Integer>(new Pulsor1());
		sb.put(new StringBuffer("Rahul"),10);
		sb.put(new StringBuffer("Suresh"),12);
		sb.put(new StringBuffer("Kangude"),8);
		sb.put(new StringBuffer("Zas"),94);
		sb.put(new StringBuffer("Visapur"),3);
		sb.put(new StringBuffer("Nagar"),96);
		System.out.println(sb);
	  /* 
	   TreeMap t=new TreeMap(new MyDemo());
		t.put("xx", 10);
		t.put("uu", 11);
		t.put("ss", 12);
		t.put("nn", 13);
		t.put("kk", 14);
		System.out.println(t)*/;
		
   }		
}


/*class MyDemo implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return -s1.compareTo(s2);
	}
}*/
class Pulsor1 implements Comparator{
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s1.compareTo(s2);
	}
	
}
	
