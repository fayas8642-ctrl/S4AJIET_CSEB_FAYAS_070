//leetcode7
class Solution {
    public int reverse(int x) {
    
        int l;

	    int rev=0;
	  
	   while(x!=0){
	       l=x%10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
	       rev=rev*10+l;
	       x=x/10;
	       
	   }
	  return rev;
    }
}        
    

