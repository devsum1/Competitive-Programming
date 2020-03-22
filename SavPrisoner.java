package test;

import java.util.Scanner;

public class SavPrisoner {
	public static void main(String args[]) {
		int i;
		Scanner input = new Scanner(System.in);
		 int t = input.nextInt();
		 for(i =0;i<t;i++) {
		 int n = input.nextInt();
		 long p = input.nextInt();
		 long s = input.nextInt();
		 
		 
		 if(n < p) {
	        p = Math.abs(p % n);
	      
		  }
		  else {
			  p = p % n;
		  }
		
		  System.out.println((p+s)-1);
 

		 if(((p+s)-1) > n) {
			 System.out.println(0+(n));
		 }
		 else {
			 System.out.println((p+s)-1);	 
		 }
		 		   		
		}
		 
}

}
