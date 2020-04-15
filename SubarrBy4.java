package test;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class SubarrBy4 {

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
		int prev2 = 0;
		int counter = 0;
		int counter2 = 0;
		int temp = 0;
		int temp2 = 0;
		int temp3 = 0;
		long multiply = 1;
		Boolean fouroccurs = false;
		int twoccurs = 0;


		for (int i = 0; i < n; i++) {

			if (arr[i] == 0) {
					prevpos = i;
				fouroccurs = true;

				count += prevpos + 1;
				count += prev2 - 0;

				counter = 0;
				temp = 0;
				counter2 = 0;
				temp3 = 0;
				
			} else if (arr[i] % 2 != 0) {
					counter += 1;
					count += ((counter) * (counter + 1)) / 2;
					count -= temp;
					temp = ((counter) * (counter + 1)) / 2;

				count += prev2 - 0;
				counter2 = 0;
				temp3 = 0;

				if (fouroccurs)
					count += prevpos + 1;
				}
			else {
				counter = 0;
				temp = 0;


				count += ((counter2) * (counter2 + 1)) / 2;
				count -= temp3;
				temp3 = ((counter2) * (counter2 + 1)) / 2;
				counter2 += 1;


				if (fouroccurs || multiply % 4 == 0)
					count += Math.max(counter2, prevpos) + 1;

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
