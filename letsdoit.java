package test;

import java.io.*;
import java.util.*;

public class letsdoit {

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
			int h = arr[0];
			int n = arr[1];
			int m = arr[2];
			boolean isDie = false;
			if (h - m * 10 <= 0) {
				System.out.println("YES");
			} else {
			
				h = (h / (int)Math.pow(2,n)) + 10*n;
				if (h <= 10 * m) {
					isDie = true;
					break;

			}
			System.out.println(isDie ? "YES" : "NO");
			}
		}
	}

}
