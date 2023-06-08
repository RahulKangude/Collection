package set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Treesetdemo {
	public static void main(String[] args) {
    TreeSet t =new TreeSet<>();
 //    t.add(null);//to get null pointer exception
     t.add("A");
     t.add("a");
     t.add("V");
     t.add("f");
    t.add("b");
    System.out.println(t.hashCode());
    System.out.println(t.add("E"));
   //  t.add(0);treeSet can only homogenous data allowed

  //  t.add(10);//ClassCastException 
     System.out.println(t);
     
     ArrayList l=new ArrayList();
     l.add(10);
     l.add(1);
     l.add(20);
     l.add(15);
     l.add(89);
     l.add(9);
     l.add('f');
     System.out.println(l);
     
     LinkedHashSet T =new LinkedHashSet(l);
     System.out.println(T);
     
    
	}
}