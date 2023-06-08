package list;

import java.util.ArrayList;

public class Arraylist1 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		ArrayList a1 = new ArrayList();
		a1.add("rk");
		a1.add("rk");
		a1.add("nd");

		a.add("Pranv");
		a.add("rahul");
		a.add("om");
		a.add("rk");
		System.out.println(a.get(2));
		a.set(2, 569);//set elements in secified position
		System.out.println(" List1  "+a);
		System.out.println(" List2  "+a1);
//		System.out.println("if elements presents d -->"+a.retainAll(a1));
//		System.out.println("after retainAll --" + a);// only passing elements sustain in list a
	

		System.out.println(a.removeAll(a1));
		System.out.println("after remove all --" + a);// only passing elements sustain in list a
//		ArrayList b = (ArrayList) a.clone();
//		b.add(10);
//		//a.clear();
//		a.iterator();
//		a.size();
//		System.out.println(b);
//		System.out.println(a.addAll(a1));
//		a.addAll(a);
//		System.out.println(a);
//		a.remove(0);
//		System.out.println(a);
//		System.out.println(a.toString());
//		System.out.println("to array" + a.toArray());
//		System.out.println(a);
//		System.out.println(a.contains("om"));

	}
}
