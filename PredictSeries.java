package test;

import java.io.*;
import java.util.*;

public class PredictSeries {
	

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
		int t = nextInt();
		while (t-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();
			if (n == 2) {
				System.out.println(arr[1] + (arr[1] - arr[0]));
				continue;
			}

			Boolean isAp = true, isGp = true, isFib = true;
			int apterm = arr[1] - arr[0];
			int gpterm = arr[1] / arr[0];

			for (int i = 2; i < n; i++) {
				if (arr[i] - arr[i - 1] != apterm)
					isAp = false;
				if (arr[i] != arr[i - 1] * gpterm)
					isGp = false;
				if (arr[i] != arr[i - 1] + arr[i - 2])
					isFib = false;
			}

			if (isAp)
				System.out.println(arr[n - 1] + apterm);
			else if (isGp && arr[n - 1] * gpterm > arr[n - 1])
				System.out.println(arr[n - 1] * gpterm);
			else if (isFib)
				System.out.println(arr[n - 1] + arr[n - 2]);
			else
				System.out.println(-99999);

		}
}

}
