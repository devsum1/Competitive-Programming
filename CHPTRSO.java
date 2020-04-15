package test;

import java.io.*;
import java.util.*;

public class CHPTRSO {

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
			ArrayList<Integer> a = new ArrayList();
			ArrayList<Integer> b = new ArrayList();

			for (int i : arr)
				a.add(i);

			int arr2[] = nextArr();

			for (int i : arr2)
				b.add(i);

			int maxa = Collections.max(a);
			int maxb = Collections.max(b);

			if (maxa > maxb)
				System.out.println("Yes");
			else if (maxb > maxa)
				System.out.println("Yes");
			else
				System.out.println("No");

		}
	}

}
