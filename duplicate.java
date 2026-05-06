
import java.util.HashMap;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String s=sc.nextLine();
	    HashMap<Character,Integer>m=new HashMap<>();
	   
	    for(char c:s.toCharArray()){
	        if(m.containsKey(c)){
	            m.put(c,m.get(c)+1);
	            
	        }
	        else{
	            m.put(c,1);
	        }
	        for(char q:m.keySet()){
	            if(m.get(q)>1){
	                System.out.println(m.get(q));

	            }
	        }
	        
	    }
	   

	   
	}
}
