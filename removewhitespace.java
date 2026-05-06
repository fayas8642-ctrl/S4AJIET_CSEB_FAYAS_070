import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	   String input="jai mahishamathi";
	   StringBuilder result=new StringBuilder();
	   for(char ch:input.toCharArray()){
	       if(!Character.isWhitespace(ch)){
	           result.append(ch);
	       }
	   }
	  
	   System.out.println(result.toString());
	}
	
}

