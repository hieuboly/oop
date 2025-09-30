package src.main.java;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
        int max=0;
        for(int i=0; i<str.length();i++){
            int count=1;
            for(int j=i+1; j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
            }
            max=Math.max(count,max);
        }
		return max; // YOUR CODE HERE
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
        if(str==null || str.length()==0) {
            return " ";
        }
        int n=str.length();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<n; i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
               if(i<n-1){
                   int m=Character.getNumericValue(ch);
                   for(int j=0;j<m;j++){
                       sb.append(str.charAt(i+1));
                   }
               }
               else {
                   sb.append(ch);
               }
            }

        }
        String k=sb.toString();
		return k; // YOUR CODE HERE
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
        if (a == null || b == null || len <= 0 || len > a.length() || len > b.length()) {
            return false;
        }
        for(int i=0;i<=a.length()-len;i++){
           String a1 = a.substring(i,i+len);
           for(int j=0;j<=b.length()-len;j++){
               String b1 = b.substring(j,j+len);
               if(a1.equals(b1)) {
                   return true;
               }
           }
        }
		return false; // YOUR CODE HERE
	}

    public static void main(String[] args) {

    }
}
