package list;

import java.util.Stack;

public class Stacklist1 {
	public static void main(String[] args) {

		Stack<Object> s=new Stack<Object>();
		s.add("Rahul");
		s.add("Suresh");
		s.add("Kangude");
		s.add("Nagar");
		s.add(54);
		s.add(999);
		System.out.println(" add all   " +s);
		s.push(5);
		System.out.println("after push "+s);
		s.pop();
		System.out.println("after pop  " +s);
		
		System.out.println("after Peek ="+s.peek());
		System.out.println("is empty--"+s.isEmpty());
		System.out.println("last elemnts -->>"+s.lastElement());
		System.out.println("size "+s.size());
     
		System.out.println(" new capacity =capacity*2-->>"+s.capacity());
		
		s.setSize(10);//set n
		System.out.println(s);
		  
        System.out.println(s.search("Nagar"));;
        System.out.println(s);
	}
}