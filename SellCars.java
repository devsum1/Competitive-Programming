package test;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class SellCars {

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

			String input[] = br.readLine().split(" ");

			ArrayList<BigInteger> arr = new ArrayList<BigInteger>();
			BigInteger mod = new BigInteger("1000000007");

			BigInteger ans = BigInteger.ZERO;

			for (String i : input)
				arr.add(new BigInteger(i));

			Collections.sort(arr, Collections.reverseOrder());
			BigInteger price = BigInteger.ZERO;


			for (int i = 0; i < arr.size(); i++) {

				if (arr.get(i).subtract(price).compareTo(BigInteger.ZERO) <= 0)
					break;

				ans = ans.add(arr.get(i).subtract(price));

				price = price.add(BigInteger.ONE);

			}

			System.out.println(ans.remainder(mod));
		}
	}

}
