package collection.map;

import java.util.TreeMap;

public class TreeMapdemo {
   public static void main(String[] args) {
	TreeMap<Integer,String> t=new TreeMap<Integer, String>();
	t.put(15, "Rahul");
	t.put(14, "Rohan");
	t.put(12, "Aditya");
	t.put(30, "Om");
	t.put(14 ,"Suhas");
	t.put(105 ,"Sujit");
	System.out.println(t);
	System.out.println("firest key "+t.firstKey());
	System.out.println(t.floorKey(12));
	System.out.println(t.lowerKey(12));
	System.out.println(t.ceilingKey(11));
	System.out.println(t.higherKey(15));
	System.out.println(t.pollFirstEntry());
	System.out.println(t.pollLastEntry());
	System.out.println(t.descendingMap());
}
}
