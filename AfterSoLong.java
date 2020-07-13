package test;

import java.io.*;
import java.util.*;

public class AfterSoLong {

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
			int ans = 0;
			int input[] = nextArr();
			int n = input[0];
			int k = input[1];
			int d[] = nextArr();

			Set<Integer> arr = new HashSet<Integer>();
			for (int i = 0; i < d.length; i++)
				arr.add(d[i]);
			ArrayList<Integer> res = new ArrayList<Integer>(arr);
			ArrayList<Integer> b = new ArrayList<Integer>();



			if (arr.size() > k) {
				System.out.println(-1);
			} else {
				if (arr.size() < k) {
					for (int i = 0; i < 100000; i++) {
						if (res.size() < k) {
							if (!res.contains(i)) {
								res.add(i);
							} else
								break;
						}
					}

				}
				int i = 0;
				while (i <= n) {
					b.add(res.get(i % res.size()));
					i++;
				}
				System.out.println(b.size());
				for (int z = 1; z <= n; z++)
					System.out.print(b.get(z) + " ");
				System.out.println();
			}
		}
	}

}
