package list;
import java.util.ArrayList; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arraylistdemo {
	public static void main(String[] args) {
		int []arr=  {10,9,1,2,5,2,5,15,241,5,1,1};
		int []arr1= {10,9,1,2,5,3,5,15,241,5,1,1};
		System.out.println(Arrays.equals(arr, arr1));
		
		System.out.println("is boolean equal =="+arr1.equals(arr));
		
		char[] c= {'r','a','h','u','l','k','n','g','u','d','e'};
	//	Arrays.sort(c);
		
		String ss=c.toString();
		System.out.println(c);
		
		ArrayList <Integer> list=new ArrayList<>();
		ArrayList <Integer> list1=new ArrayList<>();
		list.add(500);
		list.add(105);
		list.add(462);
		list.add(2);
		
		list1.add(5);
		list1.add(1 );
       System.out.println(list.retainAll(list1));
       System.out.println(list);

		//chage into synchronized array list
		List L=Collections.synchronizedList(list);
		System.out.println("synchronized array list"+L);

		//list.remove(0);
		//converting list into array
		//Object []arr1=list.toArray();
		System.out.println(Arrays.toString(arr1));

		//reversing list
		Collections.reverse(list);
		System.out.println("reverse list "+list);

		//size of list 
		System.out.println(" size of list "+list.size());

		ArrayList <Integer> list12=new ArrayList<>();
		System.out.println("is empty= "+list12.isEmpty());

		//any avilable object in list
		System.out.println("object avilable in list== "+list.contains(1));

		//add element i list 
		System.out.println("new element add -->"+list.add(415));
		list.add(2, 8951);
		System.out.println("new element add in 3rd index -->"+ list12. contains(1));
		//		list.removeIf(null);
		//		System.out.println("remove if "+list);
		//list.add(Arrays.toString(arr));
		System.out.println("AddAll "+list);



		//list.removeAll(list);
		System.out.println("before"+list);
		//System.out.println(list.retainAll(list12));
		System.out.println(list);
		System.out.println(list12);

		
		System.out.println(list.hashCode());
		System.out.println(list.toString());
		System.out.println("to extract lastindexof present value "+list.lastIndexOf(50));
		System.out.println("to extract indexof present value "+list.indexOf(500));
      list.set(5, 1851);
      System.out.println(list);
      System.out.println("current size "+list.size());
      list.trimToSize();
      System.out.println(list);
      
      ArrayList <String> al=new ArrayList<>();
      ArrayList<String> letters = new ArrayList<>(); 
      al.add("rahul");
      al.add("Suresh");
      al.add("Kangude");
      al.add("Visapur");
 //     letters.removeRange(1, 6);
     System.out.println(5);
	}

}
