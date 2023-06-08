package set;

import java.util.HashSet;

public class Hashset1 {
  public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(10);
	h.add(0);
	h.add(0);
	h.add(null);
	h.add(null);
	h.add(10);
	System.out.println(h);
	for (int i = 789; i < 810; i++) {
		h.add(i);
	}
	System.out.print(h);
	
	System.out.println(h.size());
	
	
	
	
	
	
	
	
	
}
}
