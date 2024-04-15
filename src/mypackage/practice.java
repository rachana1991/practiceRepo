package mypackage;

import java.util.HashSet;
import java.util.Set;

public class practice {

	public static void main(String[] args) {
//remove duplicate characters from a string

		String str = "abcab chab ba ca";
		Set<Character> hs = new HashSet<Character>();
		char ch[] = str.toCharArray();
		for (char e : ch) {
			hs.add(e);

		}
		StringBuilder sb = new StringBuilder();
       for (char ss: hs)
       {
    	   
    	   sb.append(ss);
    	  
       }
       System.out.println(sb.toString());
		
		
	}}