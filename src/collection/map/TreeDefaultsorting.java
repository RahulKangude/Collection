package collection.map;

import java.util.TreeMap;

public class TreeDefaultsorting {
   public static void main(String[] args) {
	TreeMap t=new TreeMap();
	t.put("xx", 10);
	t.put("uu", 11);
	t.put("ss", 12);
	t.put("nn", 13);
	t.put("kk", 14);
//	t.put(100, "ff");//classcastexception
//	t.put(null, 14);//nullpointerexception
	System.out.println(t);//Default sorting order
	
}
}
