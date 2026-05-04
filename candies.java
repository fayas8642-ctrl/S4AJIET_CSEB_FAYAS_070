//There is a jar full of candies for sale at a mall counter. The jar has the capacity N that is JAR can contain 
//maximum N Candies when a JAR is full. At any point in time, JAR can have an M number of candies where 
//M<=N. Candies are served to the customers. JAR is never remaining empty as when the last K candidates are 
//left, JAR is refilled with new candidates in such a way that JAR gets full. Write the code to implement the 
//above scenario. Display JAR at the counter with the available number of candies.
//Input should be the number of candies one customer orders at a point in time. Update the JAR after every 
//purchase and display JAR at the counter. The output should give the number of candies sold and the updated 
//number of candies in the JAR. If the input is more than the number of candies in JAR, return “INVALID INPUT”.
//Given,
//N=10, Where N is the number of candies available, K<=5, Where K is the number of minimum candies that 
//must be inside JAR ever.
//Example1: (N=10,K=<5)
//Input #1:
//3
//Output :
//Number of Candies Sold: 3
//Number of Candies available:7
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    
	    int n=10;
	    int k=5;
	    int demand=sc.nextInt();
	    int a;
	    if(demand<n){
	       a=n-demand;
	       if(demand>=6){
	           a=20;
	       }
	       System.out.println("Number of candeis sold:"+demand);
	       System.out.println("Number of candeis available"+a); 
	    }
	   
	    else{
	        System.out.println("INVALID");
	    }
	
	
	}
}
