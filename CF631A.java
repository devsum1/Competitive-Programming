package test;

import java.io.*;
import java.util.*;


public class CF631A {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] pages = new int[1000002];

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

		for (int i = 0; i < 1000000; i++)
			pages[i] = i + 1;

		int T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			if (n == 1) {
				System.out.println(1);
				System.out.println(1 + " " + 1);
				continue;
			}
			int maxsize = n / 2;
			System.out.println(maxsize);
			System.out.print(3 + " " + 1);
			for (int i = 2; i < n; i += 2) {
				System.out.println(i + " " + i + 1);
			}

		}
	}

}