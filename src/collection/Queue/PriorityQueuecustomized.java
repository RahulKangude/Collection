package collection.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuecustomized {
  public static void main(String[] args) {
	PriorityQueue q=new PriorityQueue(new MyPripority());
//	q.offer(10);
//	q.offer(12);
//	q.offer(1);
//	q.offer(40);
//	q.offer(11);
//	q.offer(107);
//	q.offer(17);
//	q.offer(15);
//	q.offer(108);
	
	q.offer("q");
	q.offer("d");
	q.offer("a");
	q.offer("v");
	q.offer("d");
	q.offer("a");
	q.offer("h");
	q.offer("c");
	q.offer("d");
	System.out.println(q);
	System.out.println(q);
	
	
}
}

class MyPripority implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
//		Integer i1=(Integer) o1;
//		Integer i2=(Integer) o2;
//		return compare(i1,i2);
		
		String s1=(String) o1;
		String s2=o2.toString();
		return -s1.compareTo(s2) ;
	}
	
}