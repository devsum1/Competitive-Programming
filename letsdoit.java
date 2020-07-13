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

		int n = nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();

		for (int i = 0; i < n; i++)
			a.add(nextInt());

		int m = nextInt();

		for (int i = 0; i < m; i++)
			b.add(nextInt());
		Collections.sort(a);
		Collections.sort(b);

		long ans = 0;
		for (int i = 0; i < a.size(); i++)
			ans += Math.abs(b.get(i) - a.get(i));

		System.out.println(ans);

	}

}
