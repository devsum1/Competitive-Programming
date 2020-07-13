package test;

import java.io.*;
import java.util.*;

public class AnagramPairs {

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

	public static String sortString(String pair) {

		char arr[] = pair.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			String s = next();
			int ans = 0;
			Set<Integer> arr;
			HashMap<String, Integer> pairs = new HashMap<String, Integer>();

			for (int i = 0; i < s.length(); i++) {
				String pair = s.charAt(i) + "";
					if (!pairs.containsKey(pair))
						pairs.put(pair, 1);
				else
						pairs.put(pair, pairs.get(pair) + 1);
			}
			System.out.println(pairs);
			arr = new HashSet<Integer>(pairs.values());
			
			if (arr.size() <= 2) {
				if (arr.size() == 2) {
					int a = Collections.frequency(pairs.values(), Collections.max(arr));
					System.out.println(a == 1 && (Collections.max(arr) - Collections.min(arr) <= 1) ? "Yes" : "No");
				} else
					System.out.println("Yes");
			} else
				System.out.println("No");


		}
	}

}
