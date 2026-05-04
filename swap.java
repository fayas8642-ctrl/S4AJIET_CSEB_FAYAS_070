public class Main
{
	public static void main(String[] args) {
		int a=2;
        int b=3;
       
        System.out.println("a="+a+",b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swap");
        System.out.println("a="+a+",b="+b);
        
	}
}
//with two operand
public class Main
{
	public static void main(String[] args) {
		int a=2;
        int b=3;
       
        System.out.println("a="+a+",b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap");
        System.out.println("a="+a+",b="+b);
        
	}
}
//with 3 variable
public class Main
{
	public static void main(String[] args) {
		int a=2;
        int b=3;
       
        System.out.println("a="+a+",b="+b);
        int c=a;
        b=a;
        a=c;
        System.out.println("after swap");
        System.out.println("a="+a+",b="+b);
        
	}
}
