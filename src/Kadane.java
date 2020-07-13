package src;

import java.io.*;
import java.util.*;

public class Kadane {

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

			int n = nextInt();
			int arr[] = nextArr();
			int ans = Integer.MIN_VALUE;
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
				ans = Math.max(ans, sum);
				ans = Math.max(ans, arr[i]);
			}
			System.out.println(ans);

		}
	}

}
