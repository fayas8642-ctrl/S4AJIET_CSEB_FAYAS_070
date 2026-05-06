import java.util.LinkedList;
import java.util.HashSet;

public class Main
{
	public static void main(String[] args) {
	  HashSet<Integer>cse=new HashSet<>();
	  cse.add(10);
	 cse.add(56);
	
	    System.out.println(cse);
	  cse.add(0);
	 
	  System.out.println(cse);
	  cse.remove(0);
	   System.out.println(cse);
	    System.out.println(cse.size());
	  cse.clear();
	   System.out.println(cse);
		  System.out.println(cse.contains('10'));
	  
	
	  
	   
	    
	     
	   
	}
}
