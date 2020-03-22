package test;
import java.util.*;

public class EasyFib{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int []fib = {0, 1, 1, 2, 3, 5, 8, 3, 1, 4, 5, 9, 4, 3, 7, 0, 7, 7, 4, 1,
				     5, 6, 1, 7, 8, 5, 3, 8, 1, 9, 0, 9, 9, 8, 7, 5, 2, 7, 9, 6, 5, 1,
				     6, 7, 3, 0, 3, 3, 6, 9, 5, 4, 9, 3, 2, 5, 7, 2, 9, 1};
		 
		
		int t = s.nextInt();
		for(int p = 0;p<t;p++) {
			long n = s.nextLong();
			long num = 2,power = 0;
			while(num <= n) {
				power+=1;
				num = num*2;
			}
			
	          long nearest = (long)Math.pow(2, power); 
   
			  System.out.println(fib[(int)(nearest%60)-1]);			
		}
	}
};


