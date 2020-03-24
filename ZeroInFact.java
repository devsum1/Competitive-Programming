package test;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class ZeroInFact{
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bf= new BufferedReader (new InputStreamReader(System.in));
	
		int t = Integer.parseInt(bf.readLine());
	
		while(t-- > 0) {
			int n = Integer.parseInt(bf.readLine());
			int j, i = 5, count = 0;
			while (i <= n) {
				count += n / i;
				i *= 5;
			}
			System.out.println(count);
		}   				    	
	}			 
}



