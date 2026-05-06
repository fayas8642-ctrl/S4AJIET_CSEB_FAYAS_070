//leetcode anagram
import java.util.Scanner;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
	        return false;
	    }
	    
	        char[]s11=s.toCharArray();
	        char[]s22=t.toCharArray();
	        Arrays.sort(s11);
	        Arrays.sort(s22);
	        return Arrays.equals(s11,s22);
	    }

        
    
}
