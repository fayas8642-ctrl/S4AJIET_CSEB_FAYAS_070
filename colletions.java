import java.util.LinkedList;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) {
	  LinkedList<Integer>cse=new LinkedList<>();
	  cse.add(10);
	 cse.add(56);
	  cse.addFirst(5);
	    System.out.println(cse);
	  cse.add(0);
	 
	  System.out.println(cse);
	  System.out.println(cse.get(0));
	 
	    cse.addLast(12);
	      System.out.println(cse);
	    Collections.sort(cse,Collections.reverseOrder());
	    System.out.println(cse);
	    
	     
	   
	}
}
