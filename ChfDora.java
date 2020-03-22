package test;
import java.util.*;
import java.math.*;
import java.io.*;

class ClassLeader{
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bf= new BufferedReader (new InputStreamReader(System.in));
		LinkedList ll = new LinkedList();
		
		int t = Integer.parseInt(bf.readLine());
	
		while(t-- > 0) {
			boolean ispower = true;
			int n = Integer.parseInt(bf.readLine());
			
			if(n == 1) 
				ispower = true;
		
			s:while(n>0) {
				if((n/2)%2 != 0) {
					ispower= false;
				    break s;
				}
				n = n/2;
			}
	       
		       	System.out.println(ispower?"Yes":"NO");
	}			 
}
}



