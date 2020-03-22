package test;
import java.io.BufferedReader;
import java.math.*;
import java.io.InputStreamReader;

class CodeChef {
	public static void main(String[] args)throws java.lang.Exception{

		BufferedReader bf= new BufferedReader (new InputStreamReader(System.in));
	    int T= Integer.parseInt(bf.readLine());
 
		while(T-- > 0) {
			BigInteger n= new BigInteger(bf.readLine());
			BigInteger a= new BigInteger(bf.readLine());
			BigInteger s = BigInteger.TEN.pow(n.intValue()).subtract(BigInteger.valueOf(5));
			System.out.println(s);
			BigInteger b= new BigInteger(bf.readLine());
			
			BigInteger c = s.subtract(a.add(b)).divide(BigInteger.valueOf(3));
			System.out.println(c);
			
			System.out.println();
			BigInteger d= new BigInteger(bf.readLine());
			BigInteger e = s.subtract(a.add(b).add(c).add(d));
			System.out.println(e);
			
			if(s == a.add(b).add(c).add(d).add(e)) {
				System.out.println(1);
			}else {
				System.out.println(-1);
			}
		}
	
	}

}





