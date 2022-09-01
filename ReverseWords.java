/*Work done by Pang, Huimin*/
/*Problem1:ReverseWords   Java*/


public class Solution {
    static String reverseWords(String s) {
	    if(s==null)
		  return null;
	    String[] words = new String[s.length()];
	    
	    int count=0;
	    for(String retval:s.split(" ")){
	    	words[count]=retval;
	    	count++; 	
	    }
	    
	     String reverse=new String("");
	    for(int i=count-1; i>=0;i--){
	    	
	    	String temp=words[i];
	    	reverse+=temp;
	    	reverse+=" ";
	    	
	    }
	    System.out.println(reverse);
	    return reverse;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="the sky is blue";
        reverseWords(s);
	}
}
