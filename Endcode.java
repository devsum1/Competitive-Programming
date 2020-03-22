package test;
import java.io.BufferedReader;
import java.math.*;
import java.io.InputStreamReader;

class EndCode{
	public static void main(String[] args)throws java.lang.Exception{

		BufferedReader bf= new BufferedReader (new InputStreamReader(System.in));
	    int T= Integer.parseInt(bf.readLine());
 
		s:while(T-- > 0) {
			BigInteger n= new BigInteger(bf.readLine());
			BigInteger a= new BigInteger(bf.readLine());
			BigInteger s = a.multiply(BigInteger.valueOf(5));
			System.out.println(s);
			BigInteger b= new BigInteger(bf.readLine());
			
			BigInteger c = s.subtract(a.add(b)).divide(BigInteger.valueOf(3));
			
			if(c.compareTo(BigInteger.ZERO) <= 0) {
				c =BigInteger.ONE;
				System.out.println(c);
		    }else
				System.out.println(c);
			
			System.out.println();
			BigInteger d= new BigInteger(bf.readLine());
			BigInteger e = s.subtract(a.add(b).add(c).add(d));
		
			if(e.compareTo(BigInteger.ZERO) <= 0) {
				e =BigInteger.ONE;
				System.out.println(e);
		    }else
				System.out.println(e);
			
			
			int ans = Integer.parseInt(bf.readLine());
			if(ans == -1)
				break s;
		}
	
	}

}


























