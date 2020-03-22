import java.util.*;

package test;
import java.util.*;
class Matrix{

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t = s.nextInt();
        while(t-- >0){
            int m = s.nextInt();
            int n = s.nextInt();
            int q = s.nextInt();
            int rows[] = new int[m];
            int col[] = new int[n];
            int count =0;
            
           for(int i = 0;i<q;i++) {
               for(int j = 0;j<2;j++) {
            	   if(j%2 == 0)
            		   rows[s.nextInt()-1]++;
            	   else 
            		   col[s.nextInt()-1]++;
        	   }
        	  
           }
           
           for(int i = 0;i<rows.length;i++) {
        	   for(int j = 0;j<col.length;j++) {
              	   if((rows[i]+col[j])%2 != 0) {
              		   count++;
              	   }
                 }
           }
           System.out.println(count);
           
            
        
                
        }
    }
}