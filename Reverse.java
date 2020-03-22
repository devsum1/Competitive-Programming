package test;
import java.util.*;
import java.io.*;

class Reverse{
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bf= new BufferedReader (new InputStreamReader(System.in));
		Stack stack= new Stack();
		
		int t = Integer.parseInt(bf.readLine());
	
		while(t-- > 0) {
			String line = bf.readLine();
			String[] split = line.toString().split(" ");
			StringBuilder fs = new StringBuilder(split[0]);
			StringBuilder ss = new StringBuilder(split[1]);
			String f ,s;
			String result = "";
			int gap,more = 0,sum = 0;
			
			
			while(fs.charAt(fs.length()-1) == '0') {
				fs.deleteCharAt(fs.length()-1);
			}
			while(ss.charAt(ss.length()-1) == '0') {
				ss.deleteCharAt(ss.length()-1);
			}
			f = fs.toString();
			s = ss.toString();
			
			if(f.length() != s.length()) {
				if(f.length()<s.length()) {
					 gap = s.length()-f.length();
					f = f+f.format("%0"+gap+"d",0);	
				}else {
					 gap = f.length()-s.length();
					s = s+s.format("%0"+gap+"d",0);	
				}
			}
			  
			   
			
			for(int i = 0;i<f.length();i++) {
				sum = Character.getNumericValue(f.charAt(i))+Character.getNumericValue(s.charAt(i))+more;
				if(sum > 9 ){
					if(i != f.length()-1) {
					more = sum/10;
					result+=sum%10;
					}
					else {
						result+=sum%10;
						result+=sum/10;
					}
					
				   }else { 	
				    result+=sum%10;
					more = 0;
					
				   }
			}
			System.out.println(Integer.parseInt(result));
		
		}   				    	
	}			 
}



