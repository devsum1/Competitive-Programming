package test;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class SquareSub {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int nextInt() throws IOException {
		return Integer.parseInt(br.readLine());
	}

	// Driver Code
	public static int[] generateRandom(int required) {
		int min = 0;
		int max = 100000000;
		Random random = new Random();
		int arr[] = new int[required];

		for (int i = 0; i < required; i++)
			arr[i] = random.nextInt(max - min) + max;


		return arr;
	}

	public static int[] nextArr() throws IOException {
		String elements[] = br.readLine().split(" ");
		int arr[] = new int[elements.length];
		for (int j = 0; j < elements.length; j++)
			arr[j] = Integer.parseInt(elements[j]) % 4;
		return arr;
	}

	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr);
	}

	public static String next() throws IOException {
		return br.readLine();
	}

	public static void calculate(int arr[], int n) {
		long count = 0;
		int prevpos = 0;
		int counter = 1;
		int temp = 0;
		int multiply = 1;
		int prevmultiply = 1;

		for (int i = 0; i < n; i++) {
			multiply *= arr[i];
			multiply %= 4;


			if (multiply % 4 == 0) {
				if (arr[i] % 4 == 0)
				prevpos = i;
				count += prevpos + 1;
			} else {
				if (arr[i] % 2 != 0) {
					counter += 1;
					count += ((counter) * (counter + 1)) / 2;
					count -= temp;
					temp = ((counter) * (counter + 1)) / 2;
					;
				}
			}


			System.out.println(count + "new");
		}
	}
	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {
			int ans = 0;
			int n = nextInt();
			int arr[] = nextArr();
			
			calculate(arr, n);

			for (int i = 0; i < arr.length; i++) {
				int multiply = 1;
				for (int j = i; j < arr.length; j++) {
					multiply *= arr[j];
					if (multiply % 4 == 0 || ((multiply % 4) & 1) != 0) {
						ans++;
					}
				}
			}
			
			System.out.println(ans);
		}
	}

}
