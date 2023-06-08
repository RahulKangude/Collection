package collection.map;

import java.util.HashMap;

public class Hashmap3 {
	public static void main(String[] args) {

		HashMap<String, Integer> hp = new HashMap<>();
		String s1 = "Pranav";
		String s2 = "Suyash";
		String s3 = "Rushi";
		String s4 = "Ram";
		String s5 = "Sham";

		hp.put(s1, 500);
		hp.put(s2, 2220);
		hp.put(s3, 10);
		hp.put(s4, 111);
		hp.put(s5, 111);

		System.out.println(" s1=" + s1.hashCode());
		System.out.println(" s2=" + s2.hashCode());
		System.out.println(" s3=" + s3.hashCode());
		System.out.println(" s4=" + s4.hashCode());
		System.out.println(" s5=" + s5.hashCode());
System.out.println(hp);
	}
}
