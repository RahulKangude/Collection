package set;

import java.util.Comparator;
import java.util.TreeSet;

public class CustdemoMix {
  public static void main(String[] args) {
	  TreeSet<Object> sb=new <Object>TreeSet(new Pulsor1());
//		sb.add("Rahul");
//		sb.add("Suresh");
//	  sb.add(("Maharastra"));
//		sb.add(("visapur"));
		sb.add(new StringBuffer("Nagar"));
		sb.add(new StringBuffer("Maharastrra"));
		sb.add(new StringBuffer("India"));
		sb.add(new StringBuffer("Asia"));
		sb.add(new StringBuffer("Earth"));
		System.out.println(sb);
	}
	}

	class Pulsor1 implements Comparator{
		public int compare(Object o1, Object o2) {
			String s1=o1.toString();
			String s2=o2.toString();
//			int i1=s1.length();
//			int i2=s2.length();
				return  s1.compareTo(s2);
		}
		
	}
