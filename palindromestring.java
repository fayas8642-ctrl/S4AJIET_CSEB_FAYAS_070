
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the string:");
	    String s=sc.nextLine();
	    String rev="";
	    int n=s.length();
	    for(int i=n-1;i>=0;i--){ 
	        rev=rev+s.charAt(i);
	    }
	    System.out.println("result="+rev);
	    if(rev.equals(s)){
	         System.out.println("palindrome");
	    }
	    else{
	         System.out.println("not palindrome");
	    }
		
	}
}
