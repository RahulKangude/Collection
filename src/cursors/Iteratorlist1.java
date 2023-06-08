package cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorlist1 {
	public static void main(String[] args) {
         ArrayList <Integer>L=new ArrayList<Integer>();       
      for (int i = 0; i <10 ; i++) {
		  L.add(i);
	}
      System.out.println("full list "+L);
      Iterator<Integer> A=L.iterator();
      
      while(A.hasNext()) {
    	 int a= A.next();	
    	  if(a%2==0) {
    		 System.out.println(a);  
    	  }
    	  else {
    		  A.remove();//remove form list 
    	  }
      }
      System.out.println(L);
      
         
         
         
         
         
         
         
         
	}
}
