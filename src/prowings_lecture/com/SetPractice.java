package prowings_lecture.com;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
  public static void main(String[] args) {
	
	  
//	  Set<Character> Student1=new LinkedHashSet<>();//insetion order is preserve or not alloed dublicate 
//	  Set<Character> Student1=new HashSet<>();//hashset insrtion order is not preserve orDublicate is not allowed 
	  /*Set<Character> Student1=new TreeSet<Character>();// its sorting in order  () or Dublicate is not allowed or null is not allowed
	  Student1.add('a');
	  Student1.add('d');
	  Student1.add('c');
	  Student1.add('e');
	  Student1.add('n');
	  Student1.add('k');
//	  Student1.add(null);//not allowed in Tree Set
	  System.out.println(Student1.add('a'));
	  Student1.add('w');
	  System.out.println(Student1);
	  System.out.println(Student1.size())*/;
	  
	  Student1 s1=new Student1(10);
	  Student1 s2=new Student1(10);
	  Student1 s5=new Student1(10);
	  Student1 s3=new Student1(10);
	  Student1 s4=new Student1(10);
	  
	  HashSet<Student1> List=new HashSet<Student1>();// its sorting in order  () or Dublicate is not allowed or null is not allowed
	  List.add(s1);
	  List.add(s2);
	  List.add(s3);
	  List.add(s4);
	  List.add(s5);
	  System.out.println(List.size());
	  
	  
}
}
class Student1{
	int rollno;

	public Student1(int rollno) {
		super();
		this.rollno = rollno;
		
	}

	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		if (rollno != other.rollno)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}