import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class ZeroInFact{
	public static void main(String[] args) throws java.lang.Exception {

		Scanner s = new Scanner(System.in);
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		int t = s.nextInt();
	
		while(t-- > 0) {

			int n = s.nextInt();
			int ans = -1;
			int arr[] = new int[n];
			
			 for (int  i= 0; i < arr.length; i++) 
				  arr[i] = s.nextInt();
			
				

			for (int i = 0; i < n; i++) {
				if (hash.containsKey(arr[i]))
					hash.put(arr[i], hash.get(arr[i]) + 1);
				else
					hash.put(arr[i], 1);
			}
			

			
			System.out.println(ans);
		}   				    	
	}			 
}



