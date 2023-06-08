package cust.demo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public interface CustomizedByNameandId {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new SortbyName());

		t.add(new Zepto(12, "Rahul", "Mechanical"));
		t.add(new Zepto(1, "Vaibhav", "Chemical"));
		t.add(new Zepto(17, "Arvind", "BCA"));
		t.add(new Zepto(14, "prajoyt", "BCA"));
		t.add(new Zepto(19, "Om", "Eletrical"));
		t.add(new Zepto(15, "Aditya", "Eletrical"));
		t.add(new Zepto(21, "Bharat", "Eletrical"));

		System.out.println("Sort by Name -->>");
		Iterator i = t.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("---------------------------------------------------");
		TreeSet t1 = new TreeSet(new SortbyRoll());

		t1.add(new Zepto(12, "Rahul", "Mechanical"));
		t1.add(new Zepto(1, "Vaibhav", "Chemical"));
		t1.add(new Zepto(17, "Arvind", "BCA"));
		t1.add(new Zepto(14, "prajoyt", "BCA"));
		t1.add(new Zepto(19, "Om", "Eletrical"));
		t1.add(new Zepto(15, "Aditya", "Eletrical"));
		t1.add(new Zepto(21, "Bharat", "Eletrical"));

		Iterator i1 = t1.iterator();
		System.out.println("sort by id--->>>\t");
		while (i1.hasNext()) {
			Zepto j = (Zepto) i1.next();
			System.out.println(j);
		}
		System.out.print("============================================");
		TreeSet t2 = new TreeSet(new SortbyDeparments());

		t2.add(new Zepto(12, "Rahul", "Mechanical"));
		t2.add(new Zepto(1, "Vaibhav", "Chemical"));
		t2.add(new Zepto(17, "Arvind", "BCA"));
		t2.add(new Zepto(14, "prajoyt", "BCA"));
		t2.add(new Zepto(19, "Om", "Eletrical"));
		t2.add(new Zepto(15, "Aditya", "Eletrical"));
		t2.add(new Zepto(21, "Bharat", "Eletrical"));
		System.out.println("sort by depatments ");
		Iterator i2 = t2.iterator();
		System.out.println("sort by  depatments--->>>\t");
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
}

class SortbyName implements Comparator<Zepto> {

	public int compare(Zepto a, Zepto b) {

		return a.Name.compareTo(b.Name);
	}

}

class SortbyRoll implements Comparator<Zepto> {

	public int compare(Zepto a, Zepto b) {
		Integer i1 = a.id;
		Integer i2 = b.id;

		return i1.compareTo(i2);
	}

}

class SortByDepartments implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1.toString();
		String s2 = (String) o2.toString();
		return s1.compareTo(s2);
	}

}

class SortbyDeparments implements Comparator<Zepto> {

	public int compare(Zepto a, Zepto b) {
		return a.department.compareTo(b.department);
	}
}

class Zepto {
	int id;
	String Name, department;

	public Zepto(int id, String name, String department) {
		super();
		this.id = id;
		Name = name;
		this.department = department;
	}

	public String toString() {
		return "id=" + id + ", Name=" + Name + ", departments-->>" + department;
	}

}
