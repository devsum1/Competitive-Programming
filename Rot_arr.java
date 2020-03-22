package test;

import java.util.Scanner;

public class Rot_arr {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		 int rot,incr,i,j;
		   int aftr[] = new int[100000];
		    int arr[] = new int[100000];
			int rotarr[] = new int[100000];
		    int a = input.nextInt();
		    int b = input.nextInt();
		    int c = input.nextInt();
		    if(b > a)
		    	rot = b % a;
		    else
		    	rot = b;
		    
		    incr = a-rot;
		    for(i = 0;i<a;i++) {
		    	arr[i] = input.nextInt();
		    }
		    
		    for(i = 0;i<c;i++) {
		    	rotarr[i] = input.nextInt();
		    }
		    
		    
		    if(incr != 0) {
		    	j = 0;
		    	 for(i = incr;i<a;i++) {
		    		 aftr[j] = arr[i];
		             j++;
		             System.out.print(arr[i]);
		    	 }
		    		 
		    	 for(i = 0;i<incr;i++) {
		    		 aftr[j] = arr[i];
		    	    j++;
		    	    System.out.print(arr[i]);
		    	 }
			    	
		    }
		    else {
		    	j = 0;
		    	for(i = 0;i<a;i++) {
			    	aftr[j]  = arr[i];	
			    	j++;
		    	}
		    }
		    for(i = 0;i<c;i++) {
		    	System.out.println(aftr[rotarr[i]]);
		    }
		    
		   		
		}

}
