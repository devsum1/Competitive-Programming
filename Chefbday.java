package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Chefbday {

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
			int mid = n / 2;
			int ans = 0;
			ArrayList<Integer> box = new ArrayList<Integer>();

			for (int i = 0; i < mid; i++)
				box.add(arr[i]);

			int max = Collections.max(box);
			box.remove(box.size() - 1);


			for (int i = arr.length - 1; i >= mid; i--) {
				box.add(0, arr[i]);
				if (Collections.max(box) < max)
					ans += 1;

				box.remove(box.size() - 1);
			}
			System.out.println(ans);

		}
	}

	public static void main(String[] args) {
		3
		6 15
		10 5 2 7 1 9
		6 -5
		-5 8 -14 2 4 12
		3 6
		-1 2 3
	}

}
