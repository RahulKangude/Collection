package cursors;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ReflectionApi {
	
	public static int getCapacity(ArrayList<Integer>List) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		int capacity =0;
		Field f1=ArrayList.class.getDeclaredField("elementData");
		f1.setAccessible(true); 
		capacity=((Object[])f1.get(List)).length;
		return capacity;
	}
	
	
  public static void main(String[] args) throws Exception {
	ArrayList<Integer> l=new ArrayList();
	System.out.println("size of list->"+l.size());
	System.out.println(" capacity of list-->"+getCapacity(l));
	
	for (int i = 0; i < 1; i++) {
		l.add(i);
	}
	l.trimToSize();

	System.out.println("size of list->"+l.size());
	System.out.println(" capacity of list-->"+getCapacity(l));
}
}
