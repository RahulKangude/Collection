package set;
import java.util.Comparator;
import java.util.TreeSet;
public class CustdemoBuffer {
  public static void main(String[] args) {
	TreeSet<StringBuffer> sb=new <StringBuffer>TreeSet(new Pulsor());
	sb.add(new StringBuffer("Rahul"));
	sb.add(new StringBuffer("Suresh"));
	sb.add(new StringBuffer("Kangude"));
	sb.add(new StringBuffer("visapur"));
	sb.add(new StringBuffer("Nagar"));
	System.out.println(sb);
}
}
class Pulsor implements Comparator{
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s1.compareTo(s2);
	}
}
