package test;
import java.util.*;

class MatchString {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t --> 0) {
		  String a = "",b = "";
		  ArrayList <Integer> count = new ArrayList<Integer>();
		  a = s.next();
		  b = s.next();
		  
		  for(int i = 0;i<a.length();i++) 
			  if(b.charAt(0) == a.charAt(i)) 
				  count.add(i);
		  String check = "";
		  boolean match = false;
		  
		 q:for(int k = 0;k<count.size();k++) {
			 check = "";
			 if(count.get(k)+b.length()<=a.length()) {
				 for(int i = count.get(k);i<count.get(k)+b.length();i++) 
					 check+= a.charAt(i);
			 }
			 
			 if(check.equals(b)) {
				 System.out.println("yes");
				 break q;
			 }
			 System.out.println("no");
		 }
		 
		  
		}
	}
}
