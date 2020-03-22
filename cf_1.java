package test;
import java.util.*;

 class cf_1 {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
  
        while(t-- > 0) {
        	
        	int a = 0,n;
        	boolean repeat  = false;
        	n = s.nextInt();
        	int arr[] = new int[n];
        	for(int i = 0;i<n;i++) {
        	     arr[i] = s.nextInt();
        		}
        	
        	for(int i = 0;i<n-1;i++) {
        		for(int j = i+1;j<n;j++) {
    				if(arr[i] == arr[j]) {
    					repeat = true;
    					a =i;
    					System.out.println(a);
    				}
    			
   		     }
        		if(!repeat) {
        			System.out.println(arr[a]);
        		}
        		repeat = false;
		     }
        	System.out.println("asjoajd");
        	}
        
        	
        }
    }
