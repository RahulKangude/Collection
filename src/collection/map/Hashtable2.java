package collection.map;

import java.util.HashMap;
import java.util.Hashtable;

public class Hashtable2 {
   public static void main(String[] args) {
	Notebook n1=new Notebook(11);
	Notebook n2=new Notebook(155);
	Notebook n3=new Notebook(13);
	Notebook n4=new Notebook(19);
	Notebook n5=new Notebook(160);
	Notebook n6=new Notebook(11);
	
	System.out.println("hashcode of n1--"+n1.hashCode());
	System.out.println("hashcode of n2--"+n2.hashCode());
	System.out.println("hashcode of n3--"+n3.hashCode());
	System.out.println("hashcode of n4--"+n4.hashCode());
	System.out.println("hashcode of n5--"+n5.hashCode());
	System.out.println("hashcode of n6--"+n6.hashCode());
	
	Hashtable h=new Hashtable();
		h.put(n1, "Rahul");
		h.put(n2, "Prajoyt");
		h.put(n3 ,"Suyash");
		h.put(n4, "Rushi");
		h.put(n5, "Arvind");
		h.put(n6, "Rahul");
	System.out.println(h);
}
}

class Notebook{
	int i;
	public Notebook(int i) {
		this.i=i;	
	}
	public int hashCode() {
		return i;	
	}
	@Override
	public String toString() {
		return i +"";
	}
	
	
	
	
	
}