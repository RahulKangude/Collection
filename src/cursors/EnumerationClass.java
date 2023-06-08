package cursors;
// Java program to test Enumeration
import java.util.Vector;
import java.util.Enumeration;

public class EnumerationClass {

	public static void main(String args[])
	{ 
		Vector<Integer> value = new Vector<>();
		for (int i = 0; i <=10; i++) {
			value.add(i);
		}
		Enumeration e=value.elements();

		while (e.hasMoreElements()) {
			int a=(int) e.nextElement();
			if(a%2==0) {
				System.out.println(a);
			}else {
				value.remove(a);
				System.out.println(value);
			}
		}
		
	}
}
