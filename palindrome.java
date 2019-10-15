import java.io.*;
import java.util.*;
public class palindrome {



	  public static String[] candidates = {
	    "never odd# or even!",
	    "Rats live on no evil Star!!",
	    "No lemons, no melon",
	    "Nolemonsnomelon"
	  };
	  
	  public static Boolean isPalindrome(String candidate) {
	    // Make this work
	    String rev = "";
	       //ignoring case , special chars, spaces
	    StringBuilder cleansedData = new StringBuilder();
	    candidate = candidate.toLowerCase();
	    int length = candidate.length();
	    for(int i=0;i<length-1;i++){
	      char c = candidate.charAt(i);
	      if(isAlphabet(c)){
	        cleansedData.append(c);
	      }
	    }
	    
	    candidate = cleansedData.toString();
	    length = candidate.length();
	    StringBuilder revSb = new StringBuilder();
	    for ( int i = length -1; i >= 0;i--){
	      revSb.append(candidate.charAt(i));
	    }
	    rev = revSb.toString();
	    
	    if (candidate.equals(rev)){
	    return true;
	    }
	    else
	    {
	     return false; 
	    }
	  
	  
	  }
	   
	         
	  public static Boolean isAlphabet(char alphabet){
	    if(alphabet >=65 && alphabet <= 90){
	      return true;
	    }
	    return false;
	  }
	  
	  public static void main(String[] args) {
	    for (String candidate : candidates) {
	      System.out.println(candidate + ": " + isPalindrome(candidate));
	    }
	  }
	}
