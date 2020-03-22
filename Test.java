package test;
import java.util.*;


	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		for(i = 0;i<t;i++) {
			ArrayList<Integer> fib = new ArrayList<Integer>();
			
			fib.add(0);
			fib.add(1);
			int i,first = 0,second = 1,sum,j = 0;
			int n = s.nextInt();
			
			for(i = 2;i<n;i++) {
		    		sum = first+second;
		    		first = second;
		    		second = sum;
		    		fib.add(sum%10);
			}
			
		
			while(fib.size() != 1) {
			ArrayList<Integer> res = new ArrayList<Integer>();
			for(i = 0;i<fib.size();i++) {
	    		if(i%2 != 0) {
	    			res.add(fib.get(i));
	    		
	    		}	
	    			
		    }
		
			fib = res;
			
			}
	
			System.out.println(fib.get(0));
		}
	}

}