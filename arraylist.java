import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	  ArrayList<String>list=new ArrayList<>();
	  list.add("java");
	  list.add("python");
	  list.add("java");
	  list.add(0,"c");
	  list.set(2,"c");
	  list.remove(1);
	  list.clear();
	  System.out.println(list);
	  System.out.println(list.get(0));
	}
}
