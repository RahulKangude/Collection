package cursors;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 
{
	public static void main(String[] args)
	{
		Vector<Integer> v = new Vector<Integer>();
		Enumeration val;
		for (int i = 1; i <= 10; i++) 
		{
			v.addElement(i);
		}
		System.out.println(v);

		val = v.elements();
		System.out.println("cddddddddddddd");
		while (val.hasMoreElements())
		{
			System.out.println(val.nextElement());
		}
	}
}
