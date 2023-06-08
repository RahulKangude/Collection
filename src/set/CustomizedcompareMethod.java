package set;

import java.util.Comparator;
import java.util.TreeSet;

public class CustomizedcompareMethod {
	public static void main(String[] args) {
	TreeSet<Integer> t=new TreeSet<Integer>(new TreeDemo1());
	System.out.println(t.add(1));
	System.out.println(t.add(5));
	t.add(9);
	t.add(91);
	t.add(48);
	t.add(28);
	t.add(1);
//	System.out.println("I1.compareTo(I2)-->>"+t);//natural  accending sorting order
//	System.out.println("-I1.compareTo(I2)-->>"+t);//-decending ssrting order
//	System.out.println("I2.compareTo(I1)-->>"+t);//decending s sorting order
//	System.out.println("-I2.compareTo(I1)-->>"+t);//decending s sorting order
//	System.out.println("return +1-->>"+t);// forward insertion order preserve
//	System.out.println("return -1-->>"+t);//  reverse insertion  order preserve
	System.out.println("retun 0"+t);// only first element is add other consider as dublicate 

}
}
class TreeDemo1 implements Comparator{

	public int compare(Object Obj1, Object Obj2) {
	Integer I1=(Integer) Obj1;
	Integer I2=(Integer) Obj2;
 //	return I1.compareTo(I2);
//	return -I1.compareTo(I2);
//	return I2.compareTo(I1);
//	return -I2.compareTo(I1);
//	return  +1;
//	return  -1;
	return 1;
	
}
}