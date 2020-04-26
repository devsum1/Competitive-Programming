package test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class ZeroInFact{
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bf= new BufferedReader (new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
	
		while(t-- > 0) {
			int arr[] = new int[100];
			int n = s.nextInt();

			for (int i = 0; i < n; i++)
				arr[s.nextInt() - 1]++;

			for (int i = 0; i < n; i++) {
				if (arr[i] > n / 2) {
					flag = true;
					ans = arr[i];
					break;
				}
			}

		}   				    	
	}			 
}



