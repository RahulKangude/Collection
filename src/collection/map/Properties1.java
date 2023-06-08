package collection.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Properties1 {
  public static void main(String[] args) throws Exception {
	Properties p=new Properties();
	FileInputStream fis  =new FileInputStream("abc.txt");
	p.load(fis);
	System.out.println(p);
	String s=p.getProperty("rahul");
	System.out.println(s);
	p.setProperty("Om", "1851");
	FileOutputStream fos=new FileOutputStream("abc.txt");
	p.store(fos, "Updated by Rahul");
	p.store(fos, "Updated by Rahul");
	
}
}

