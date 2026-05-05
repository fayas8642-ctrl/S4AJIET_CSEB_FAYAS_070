//largest
public class Main
{
	public static void main(String[] args) {
	   int[] num={1,2,3,4};
	   int n=0;
	   for(int i=0;i<num.length;i++){
	       if(num[i]>n){
	           n=num[i];
	       }
	   }
	   System.out.println(n);
	}
}
//smallest
public class Main
{
	public static void main(String[] args) {
	   int[] num={1,2,3,4};
	   int n= num[0];
	   for(int i=0;i<num.length;i++){
	       if(num[i]<n){
	           n=num[i];
	       }
	   }
	   System.out.println(n);
	}
}
