import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine().toLowerCase();
	    int vowels=0,consanants=0;
	    int n=s.length();
	    
	    for(int i=0;i<n;i++){
	        char chr=s.charAt(i);
	        if(chr>='a'&&chr<='z'){
	            if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'){
	                vowels++;
	            }
	            else{
	                consanants++;
	            }
	        }
	        
	        
	    }
	    System.out.println("vowels="+vowels);
	     System.out.println("consanats="+consanants);


	    
	  
	}
}
