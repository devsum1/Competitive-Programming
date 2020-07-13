package test;

import java.io.*;
import java.util.*;

public class FindCovid {

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
			int p = arr[1];

			int people[][] = new int[n][n];

			int A = 0, B = 0, X = 0;

			for (int i = 1; i <= n; i++) {

				System.out.println(1 + " " + i + " " + 1 + " " + i + " " + n);
				A += (i - i) + 1;
				B += (n - 1) + 1;
				int ans = nextInt();
				if (ans == -1)
					continue;
				X += ans;

				for (int k = 0; k < ans; k++)
					people[i - 1][k] = 1;

			}
			System.out.println(2);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++)
					System.out.print(people[i][j] + " ");
				System.out.println();
			}
//			System.out.println(A + " " + B + " " + X);
//			int score = ((2 * n - A) * (2 * n - B)) / (1 + X);
//			System.out.println(score);

			int judge = nextInt();
			if (judge == -1)
				break;

		}
	}

}
