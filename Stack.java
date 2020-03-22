package test;
import java.util.*;
import java.math.BigInteger;

class Stack{
	public static void solve(String first,String second) {
	int bigger = first.length()>second.length()?first.length():second.length();
	
	if(first.length() > second.length()) {

		System.out.println(first);
		for(int j = 0;j<bigger-second.length();j++) 
			System.out.print(" ");
		
		System.out.println(second);
	
	    for(int i = 0;i<first.length();i++) 
	    	System.out.print("-");
	    
	    System.out.println();
	  
	    BigInteger a = new BigInteger(first); 
        BigInteger b  = new BigInteger(second); 
	  
	    BigInteger ans = a.add(b);
	    		
	    for(int i = 1;i<=bigger-String.valueOf(ans).length();i++)
	    	System.out.print(" ");
	    
	    System.out.println(String.valueOf(ans));
	   
	}
	
	else{
	
		for(int j = 0;j<bigger-first.length();j++) 
			System.out.print(" ");
		
		System.out.println(first);
		System.out.println(second);
	
	    for(int i = 0;i<second.length();i++)
	    	System.out.print("-");
	    
	    System.out.println();
	    BigInteger val;
	    BigInteger a = new BigInteger(first); 
        BigInteger b  = new BigInteger(second); 
	  
	    BigInteger ans = a.add(b);
	  
	    
	    for(int i = 1;i<=bigger-String.valueOf(ans).length();i++)
	    	System.out.print(" ");
	    
	    System.out.println(ans);
	}

	}
	
	public static void solvemultiply(String first,char operator,String second) {
	  
		int bigger = first.length()>second.length()?first.length():second.length()+1;
		
		BigInteger a = new BigInteger(first); 
        BigInteger b  = new BigInteger(second); 
        BigInteger ans =a.multiply(b);
        if(first.length() == 1 && second.length() == 1)
        	System.out.print("");
        for(int i = 1;i<=second.length()-first.length()+1;i++) 
        	System.out.print(" ");
        System.out.println(first);
       
       
        for(int i = 1;i<ans.toString().length()-second.length();i++) 
        	System.out.print(" ");
        System.out.println((char)operator +second);
       
		 if(first.length() == bigger) {
			 for(int i = 1;i<=ans.toString().length()-first.length();i++) 
		        	System.out.print(" ");  
			 for(int i = 1;i<=first.length();i++) 
				 System.out.print("-");
		 }
		 else{
			 for(int i = 1;i<ans.toString().length()-second.length();i++) 
    	        	System.out.print(" ");
			 for(int i = 1;i<=second.length()+1;i++) 
				 System.out.print("-");
		 }
		 System.out.println();
		 
    		int y = 0;
    		BigInteger res = new BigInteger("0");
    		String each= "";
            
		for(int i = second.length()-1;i>=0;i--){
			int s = 0;
			   String j = ""+second.charAt(i);
			   if(second.charAt(i) == '0') {
					  for(int l = 1;l<first.length();l++)
						  j+=" "; 
					  
					  each = j;
					  s = a.toString().length()-1;
					  res = BigInteger.ZERO;
					  					  
				 }else {
					  BigInteger p = new BigInteger(j);
					    res = a.multiply(p);
					    each = res.toString();
					     
				 }
			   
			
			   for(int z = ans.toString().length()-each.length()-y+s;z>0;z--)
				   System.out.print(" ");
				  
			   y++;
			   s = 0;
			   
			   if(second.length()>1) 
				   System.out.println(res); 
			   
				   			   
		}
		if(second.length()>1) {
			for(int i = 1;i<=ans.toString().length();i++) 
				System.out.print("-");
			System.out.println();
			System.out.println(ans);
		   }
		else 
			   System.out.println(ans);
		   
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t --> 0) {
	     String exp;
	     String first,second;
	     exp = s.next();
	  
	     	if(exp.indexOf('+') > -1 || exp.indexOf('-')> -1) {
	     		int seperator = exp.indexOf('+')>-1?exp.indexOf('+'):exp.indexOf('-');
	     		first = exp.substring(0, seperator);
	     		second =exp.substring(seperator,exp.length());
	     		solve(first,second);
	     	}
	    	
	     	else {
	     		 int seperator = exp.indexOf('*');
		    	 first = exp.substring(0, seperator);
		    	 second =exp.substring(seperator+1,exp.length());
	     		 solvemultiply(first,exp.charAt(seperator),second);
	     	}
	    	 System.out.println();
		}
	}

}

