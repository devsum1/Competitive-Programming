package test;
import java.util.*;

class NextPallindrome {
	public static void generatePallindrome(StringBuilder p){
		StringBuilder q=new StringBuilder(p); 
		int full = q.length();
		for(int i = 0;i<full/2;i++) {
				if(q.charAt(i) != q.charAt(full-i-1)){
					q.setCharAt(full-i-1, q.charAt(i));
				}
		}
	     int qValue = Integer.valueOf(q.toString());
	     int pValue = Integer.valueOf(p.toString());
	     int numberVal = qValue /(qValue/10);
	     
		if(  qValue > pValue){
	       System.out.println(qValue);		
		}
		else if(qValue <100) {
			System.out.println(qValue+11);
		}
		else {
			System.out.println(numberVal);
			System.out.println(qValue+numberVal);
		}
		
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t --> 0) {
			StringBuilder p=new StringBuilder(s.next());  
		  generatePallindrome(p);
		  
		}
	}
}
