package list;

import java.util.ArrayList;

public class Demop {
public static void main(String[] args) {
	ArrayList n=new ArrayList();
	
	n.add(10);
	n.add(11);
	n.add(12);
	n.add(13);
	ArrayList n1=new ArrayList();
	n1.add(10);
	n1.add(11);
	   
	System.out.println("size --"+n.size());
//	System.out.println(n.retainAll(n1));
//	System.out.println(n.size());	
	System.out.println(n);
	System.out.println("-----------------------");
	System.out.println("before trim --"+n.size());
	n.add(45);
	n.trimToSize();
	System.out.println("After trim --"+n.size());
	
}
}