import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

	    int count=0;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the no:of students");
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    System.out.println("Enter the rank of students:");
	    	    
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	        
	    }
	    	    int large=arr[0];
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]<large){
	            large=arr[i];
	            count++;
	            
	            
	        }
	    }
	    System.out.println("Result="+count);
	    
	    

	    
	  
	}
}
