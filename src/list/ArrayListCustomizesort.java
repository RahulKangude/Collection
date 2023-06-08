package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListCustomizesort {
	public static void main(String[] args) {
		
	ArrayList<Integer> l=new ArrayList();
	l.add(10);
	l.add(11);
	l.add(12);
	l.add(0);
	l.add(5);
	l.add(0);
	l.add(70);
	l.add(70);
	l.add(70);
	l.add(70);
	l.add(70);
	l.add(70);

	Object []arr= l.toArray();
	System.out.println(Arrays.toString(arr));
	
    // Convert ArrayList to Array
////    Integer [] array = (Integer[]) l.toArray(new Integer[0]);
////    System.out.println(Arrays.toString(array));
//  
//    // Print the array
//    for (Integer n : array) {
//        System.out.println(n);
//    }
//	
//	System.out.println(array.length);
//	for(int i=0;i<array.length;i++) {
//		if(i%2==0) {
//	
//			System.out.println(i);
//		}
//		else {
//			int sum =i;
//		}
//	}
	Collections.sort(l,new MycustArray());
	System.out.println(l);

}
}
class MycustArray implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		return -i1.compareTo(i2) ;
	}
	
}