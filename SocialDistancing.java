package test;

import java.io.*;
import java.util.*;

public class SocialDistancing {

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

			Boolean following = true;
			int prevpos = 0;
			String str = "";

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 1) {
					prevpos = i;
					break;
				}
			}

			for (int i = prevpos + 1; i < arr.length; i++) {
				if (arr[i] == 1) {
					if (i - prevpos < 6) {
						following = false;
						break;
					}
					prevpos = i;
					}
				}

			System.out.println(following ? "YES" : "NO");
		}
	}

}
