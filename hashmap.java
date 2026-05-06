
import java.util.HashMap;

public class Main
{
	public static void main(String[] args) {
	    HashMap<Integer,String>m=new HashMap<>();
	    m.put(101,"alice");
	    m.put(102,"bob");
	    m.put(103,"aaa");
	    System.out.println(m);
	    m.get(102);
	    System.out.println(m.get(101));
	    m.remove(102);
	    System.out.println(m);
	    System.out.println(m.size());
	    m.clear();
	    System.out.println(m);

	  

	   
	}
}
