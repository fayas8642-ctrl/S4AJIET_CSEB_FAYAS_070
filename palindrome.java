//palindrome
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int l;

	    int rev=0;
	  int  i=x;
      
	   while(x!=0){
	       l=x%10;
             
	       rev=rev*10+l;
	       x=x/10;
	       
	   }
      return rev==i;
        
    }
}
