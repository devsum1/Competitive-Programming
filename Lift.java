package test;

import java.util.*;
import java.io.*;

public class Lift {

	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int nextInt() throws IOException {
		return Integer.parseInt(br.readLine());
	}

	public static int[] nextArr() throws IOException {
		String elements[] = br.readLine().split(" ");
		int arr[] = new int[elements.length];
		for (int j = 0; j < elements.length; j++)
			arr[j] = Integer.parseInt(elements[j]);
		return arr;
	}

	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr);
	}

	public static String next() throws IOException {
		return br.readLine();
	}


	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {
            int arr[] = nextArr();
            int n = arr[0];
            int q = arr[1];
            int ans = 0;
            int currfloor = 0;
           for (int i = 0; i <q; i++) {
			  
        	   int query[] = nextArr();
			   int s = query[0];
			   int d = query[1];
			   
				ans += Math.abs(d - s);
				ans += Math.abs(s - currfloor);
				currfloor = d;
		   }
			System.out.println(ans);
			

		}
	}

}
