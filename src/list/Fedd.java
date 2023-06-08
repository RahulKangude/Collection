package list;

import java.util.ArrayList;

public class Fedd {
	public static void main(String[] argv) {

		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("A");
		arrlist.add("B");
		arrlist.add("C");
		arrlist.add("D");

		System.out.println("ArrayList: " + arrlist);

		arrlist.ensureCapacity(5);
		System.out.println("ArrayList can now" + " surely store upto" + " 5 elements.");

	}
}
