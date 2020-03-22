package test;

import java.util.Scanner;

public class String_1{

	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
		   int t = s.nextInt();
		   s.nextLine();
		   while(t-- > 0) {
		    String p = s.nextLine();
		    int end = p.length()+1;
		    p = " "+p;
		    for(int i = p.length()-1;i>=0;i--) {
		    	if((int)p.charAt(i) >= 65 && (int)p.charAt(i)<= 90) {
		    	}
		    	else if((int)p.charAt(i) >= 97 && (int)p.charAt(i)<= 122) {
		    	}
		    	else {
		    		
		    		for(int j = i+1;j<end;j++) {
		    			System.out.print(p.charAt(j));
		    		}
		    		System.out.print(p.charAt(i));
		    		end = i;
		    	}
		    			
		    }
		    System.out.println();
		   }
	}

}
