package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class checkPower {
	static {
		System.out.println("hello");
	}

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bf= new BufferedReader (new InputStreamReader(System.in));
	
		int t = Integer.parseInt(bf.readLine());
	
		while(t-- > 0) {
			boolean ispower = true;
			long n = Long.parseLong(bf.readLine());
			
			if(n == 0) 
				ispower = false;
		
			s:while(n>1) {
				if(n%2 != 0) {
					ispower= false;
				    break s;
				}
				n = n/2;
			}
	       System.out.println(ispower?"YES":"NO");
		       	

	}

}
}
