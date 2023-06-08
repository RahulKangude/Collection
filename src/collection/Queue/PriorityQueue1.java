package collection.Queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
 public static void main(String[] args) {
	PriorityQueue q=new PriorityQueue();
	
	q.offer(10);
	q.offer(1);
	q.offer(40);
	q.offer(15);
	q.offer(18);
//	q.offer(null); null is not allowed
	q.offer(5);
	q.offer(89);
	System.out.println("peek "+q.peek());
	System.out.println(q);
	System.out.println("Size "+q.size());
	System.out.println("element "+q.element());
	System.out.println(q);
	System.out.println("poll "+q.poll());//display first element and delete
	System.out.println(q);
	System.out.println("remove "+q.remove());
	System.out.println(q);
	
}
}
