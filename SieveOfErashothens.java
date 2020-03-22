package test;
import java.util.*;

class SieveOfErashothens {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t --> 0) {
			int a = s.nextInt();
			int f= s.nextInt();
			boolean prime = true;
			
			ArrayList<Integer> divides = new ArrayList<Integer>();
			
			for(int i = 2;i<=Math.round(Math.sqrt((float)f));i++) {
				 for(int j = 2;j<i;j++) {
			        	if(i % j == 0) {
			        		prime = false;
			        		break;
			        	}
			        }
			        if(prime) {
			        	divides.add(i);
			        	if(i>= a)
				        System.out.println(i);
			        }
			        	
					prime = true;
			}
			
			
			for(int i = a;i<=f;i++) {
				for(int j = 0;j<divides.size();j++) {
					
					if(i % divides.get(j) == 0) {
						prime = false;
						break;	
					}
						
				}
				if(prime && i!=1)
					System.out.println(i);
				prime = true;
			}
			
		}
		
	}
}
