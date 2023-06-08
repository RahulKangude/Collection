package collection.map;

import java.util.WeakHashMap;

public class WeakHashMap2 {
	public static void main(String[] args) throws InterruptedException {
    WeakHashMap w=new WeakHashMap<>();
    Cap c=new Cap();
    Cap c1=new Cap();
    w.put(78, 7);
    w.put(127, 100);
    w.put(c, 74);
    w.put(c1, 9);
    c=null;
    System.out.println("Before gc"+w);
    System.gc();
    Thread.sleep(1000);
    System.out.println("After gc"+w);
    
	
	
	
	
	}
}

class Cap{
  @Override
public String toString() {
	// TODO Auto-generated method stub
	return "c";
}
}