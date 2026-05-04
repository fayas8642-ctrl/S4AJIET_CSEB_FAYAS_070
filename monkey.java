public class Main
{
	public static void main(String[] args) {
		int n=20;
		int k=2;
		int j=3;
		int m=12;
		int p=12;
		int a=m%k;
		int b=p%j;
		int x,y,w,total;
		if(a==0&&b==0){
		     x=m/k;
		     y=p/j;
		     w=x+y;
		    
		    
		    
		}
		else{
		     x=m/k;
		     y=p/j;
		     w=x+y+a+b;
		    
		    
		}
	 total=n-w;
		System.out.println("Toatal monkeys left="+total);
		
		
	}
}
