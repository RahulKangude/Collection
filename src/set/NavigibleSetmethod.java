
package set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigibleSetmethod {
  public static void main(String[] args) {
  TreeSet<Integer> n=new TreeSet<Integer>();
  n.add(10);
  n.add(17);
  n.add(45);
  n.add(18);
  n.add(19);
  n.add(16);
  n.add(22);
  Object s=n.clone();
  System.out.println("clone "+s);
  System.out.println(n);
  System.out.println("retrun lower value 18-->"+n.lower(18));
  System.out.println("retrun floor value of 21-->>"+n.floor(21));
  System.out.println("retrun ceiling value of 23-->>"+n.ceiling(23));
  System.out.println("retrun higher value of 2-->>"+n.higher(2));
  System.out.println("retrun pullfirst value-->>"+n.pollFirst());
  System.out.println(n);
  System.out.println("retrun pollLast value-->>"+n.pollLast());
  System.out.println(n);
  NavigableSet rev =n.descendingSet();

  System.out.println("reverse order of set--"+rev);
//  
//  NavigableSet<Integer> sub =(NavigableSet<Integer>) n.subSet(17, 22);
//  System.out.println("subSet method--"+sub);
  SortedSet<Integer> tail=n.tailSet(17);
  System.out.println("tailSet of 17-->>"+tail);
  SortedSet<Integer> head=n.headSet(18);
  System.out.println("Headset of 18-->"+head);
}
}
