import java.util.LinkedList;
import java.util.collections;

public class Main
{
	public static void main(String[] args) {
	  LinkedList<String>list=new LinkedList<>();
	  list.add("java");
	  list.add("python");
	  list.addFirst("java");
	    System.out.println(list);
	  list.add(0,"c");
	  list.set(2,"c");
	  System.out.println(list);
	  System.out.println(list.get(0));
	  list.remove(1);
	    System.out.println(list);
	    list.addLast("ada");
	      System.out.println(list);
	      list.removeFirst();
	        System.out.println(list);
	        list.removeLast();
	          System.out.println(list);
	   
	}
}
