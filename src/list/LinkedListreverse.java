package list;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListreverse {
  public static void main(String[] args) {
	LinkedList l=new LinkedList();
	
	l.add(10);
	l.add(1);
	l.add(80);
	l.add(15);
	l.add(14);
	l.add(4);
	l.add("Rahul");
	System.out.println(l);
	Collections.reverse(l);
	System.out.println(l);
	
	int A[] = {1,2,5,4,0};
	int B[] = {2,4,5,0,1};

	Arrays.sort(A);
	Arrays.sort(B);
	
	System.out.println(Arrays.equals(A, B));
	
	
	
	
	
	
	
}
}
