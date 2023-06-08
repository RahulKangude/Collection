package cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class Listiterater1 {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("rahul");
		l.add("kangude");
		l.add("Tvs");
		l.add("dell");

		//    	l.add(52);
		//    	l.add(89);
		//    	l.add(100);

		ListIterator itr=l.listIterator();

		while(itr.hasNext()) {
			String  o= (String)itr.next();
			if(o.equals("rahul")) {
				itr
				.remove();
				System.out.println(o);
			}else if(o.equals("T"+ "vs")){
				itr.add("hp");
				System.out.println(o);
			}
			else if(o.equals("dell")) {
				itr.set("pro");
				System.out.println(o);
			}

		}
		System.out.println(l);

	}
}
