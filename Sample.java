package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Sample {

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

	public static String swap(String str, int i, int j) {
		char ch[] = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;

		return new String(ch);
	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();

			ArrayList<Integer> res = new ArrayList<Integer>();

			for (int i = 0; i < arr.length; i++)
				res.add(arr[i]);

			int max = Collections.max(res);
			int findex = res.indexOf(max);

			res.set(findex, Integer.MIN_VALUE);
			int smax = Collections.max(res);
			int sindex = res.indexOf(smax);

			System.out.println(findex + " " + sindex);
			int start = Math.min(findex, sindex);
			int last = Math.max(findex, sindex);

			int sum1 = 0, sum2 = 0;
			for (int i = start; i <= last; i++)
				sum1 += arr[i];

			System.out.println(start + " " + last);
			for (int i = last; i < n; i++)
				sum2 += arr[i];
			for (int i = 0; i <= start; i++)
				sum2 += arr[i];


			System.out.println(Math.max(sum1, sum2));

		}
	}

}
