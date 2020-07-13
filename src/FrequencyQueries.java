package src;

import java.io.*;
import java.util.*;

public class FrequencyQueries {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int nextInt() throws IOException {
		return Integer.parseInt(br.readLine());
	}

	public static long nextLong() throws IOException {
		return Long.parseLong(br.readLine());
	}

	public static String next() throws IOException {
		return br.readLine();
	}

	public static int[] sortArr(int arr[]) throws IOException {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i : arr)
			a.add(i);

		Collections.sort(a);

		for (int i = 0; i < a.size(); i++)
			arr[i] = a.get(i);
		return arr;
	}

	public static int[] desortArr(int arr[]) throws IOException {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i : arr)
			a.add(i);

		Collections.sort(a, Collections.reverseOrder());

		for (int i = 0; i < a.size(); i++)
			arr[i] = a.get(i);
		return arr;
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

	public static void main(String[] args) throws IOException {

		int T = 1;

		while (T-- > 0) {

			int n = nextInt();
			StringBuilder answer = new StringBuilder();
			HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

			int query[][] = new int[n][2];
			for (int i = 0; i < n; i++) {
				int arr[] = nextArr();
				for (int j = 0; j < arr.length; j++) {
					query[i][j] = arr[j];
				}
			}
			for (int i = 0; i < n; i++) {

				int move = query[i][0];
				int elem = query[i][1];

				if (move == 1) {
					if (!hash.containsKey(elem))
						hash.put(elem, 1);
					else
						hash.put(elem, hash.get(elem) + 1);

				} else if (move == 2) {
					if (hash.containsKey(elem)) {
						if (hash.get(elem) == 1)
							hash.remove(elem);
						else
						hash.put(elem, hash.get(elem) - 1);
					}
				} else {
					Boolean found = false;

					for (int j : hash.values()) {
						if (j == elem) {
							found = true;
							break;
						}
					}
					answer.append(found ? "1" : "0");
					answer.append("\n");
				}
				System.out.println(hash);
			}
			
			System.out.println(answer);
		}
	}

}
