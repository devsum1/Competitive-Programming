package test;
import java.util.*;
import java.io.*;
import java.math.BigInteger;

class ZeroInFact{
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bf= new BufferedReader (new InputStreamReader(System.in));
	
		int t = Integer.parseInt(bf.readLine());
	
		while(t-- > 0) {
			String line = "12232";
			String split[] = line.split(" ");
			int n = Integer.parseInt(line);
			int j,i = 5,count = 0;
			while(i<=n){
	            count+=n/i;
	            i*=5;
			}
			System.out.println(count);				       
		}   				    	
	}			 
}



