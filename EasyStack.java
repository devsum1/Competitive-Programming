package test;
import java.util.*;
import java.io.*;

class EasyStack{
	
	public static int getInt(String s) {
		return Integer.parseInt(s);
	}
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bf= new BufferedReader (new InputStreamReader(System.in));
	  
		Stack stack = new Stack();
		
		bf.readLine();
	    String line = null;
		
		while((line = bf.readLine())!= null && line.length() > 0) {
			int n = 0,e = 0;
			
	   if(line.length() == 1) 
		    n = getInt(line);
	   else {
		    n = Character.getNumericValue(line.charAt(0));
		    e = getInt(line.substring(2,line.length()));
	   }
	       
	       if(n == 1) stack.push(e);
	    			 
	    	else if(n == 2) {
	    		if(!stack.empty()) stack.pop();
	    	}
	    	else{	
	    		if(!stack.empty()) 
	    			System.out.println(stack.peek());
	    		else
	    			System.out.println("Empty!");
	        }
	       
		}
	    				    	
	}
			 
}
