package list;

import java.util.Vector;

public class Vectorlist1 {
  public static void main(String[] args) {
	Vector<Object> v=new Vector<Object>(100,1);
//	Vector<Object> v=new Vector<Object>(100,1);set own value incremental capacity
	v.add(10);
	v.add(156.56f);
	v.add(0.463);
	v.add(4.777d);
	v.add("Rahul");
	
	Vector <Object> v1=new Vector<>(v);
	System.out.println("new vector-->>"+v1);
	
	System.out.println("All vector list "+v);
	v.remove(2);
	System.out.println(v);
	System.out.println(v.firstElement());
	System.out.println(v.lastElement());
	System.out.println("privious size >>"+v.size());
	System.out.println("privious capacity >>"+v.capacity());
	v.add(10);
	v.add(156.56f);
	v.add(0.463);
	v.add(4.777d);
	v.add("Rahul");
	v.add("Rahul");
	v.add("Rahul");
	System.out.println("current size>>"+v.size());
	System.out.println("current  capacity>>>"+v.capacity());
	System.out.println("------------------------------------------------");
	System.out.println(" last index of "+v.lastIndexOf(10));
	System.out.println(" last index of "+v.indexOf(10));
	
	for (int i = 0; i <100; i++) {
		v1.add(i);
	}
	
	System.out.println(v1.capacity());
	System.out.println(v1.size());
}
}
