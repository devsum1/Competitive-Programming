package test;

import java.io.*;
import java.util.*;

public class GeneString {

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

	public static Boolean validgene(ArrayList<Integer> gene, int n) {
		for (int i = 0; i < gene.size(); i++) {
			if (gene.get(i) > n) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int ans = Integer.MAX_VALUE;
			StringBuilder s = new StringBuilder(next());
			StringBuilder extra = new StringBuilder();
			HashMap<Character, Integer> hash = new HashMap<Character, Integer>();


			for (int i = 0; i < s.length(); i++) {

				if (!hash.containsKey(s.charAt(i)))
					hash.put(s.charAt(i), 1);
				else
					hash.put(s.charAt(i), hash.get(s.charAt(i)) + 1);

				if (hash.get(s.charAt(i)) > n / 4)
					extra.append(s.charAt(i));
			}


			if (s.indexOf(extra.toString()) != -1)
				System.out.println(extra.length());
			else {
				int left = 0, right = 0;

				while (right < s.length()) {
					System.out.println(hash);
					hash.put(s.charAt(right), hash.get(s.charAt(right)) - 1);
					right += 1;

					while (validgene(new ArrayList<Integer>(hash.values()), (n / 4))) {
						ans = Math.min(ans, right - left);
						hash.put(s.charAt(left), hash.get(s.charAt(left)) + 1);
						left += 1;
					}
					System.out.println(left + " " + right);

				}
				System.out.println(ans);
			}


		}
	}

}
