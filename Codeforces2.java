package test;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Codeforces2 {

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
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while (T-- > 0) {

			BigInteger a = s.nextBigInteger();
			BigInteger b = s.nextBigInteger();
			BigInteger c = s.nextBigInteger();
			BigInteger d = s.nextBigInteger();

			BigInteger x = s.nextBigInteger();
			BigInteger y = s.nextBigInteger();
			BigInteger x1 = s.nextBigInteger();
			BigInteger y1 = s.nextBigInteger();
			BigInteger x2 = s.nextBigInteger();
			BigInteger y2 = s.nextBigInteger();

			BigInteger movex = x.subtract(a).add(b);
			BigInteger movey = y.subtract(c).add(d);


			if (movex.compareTo(x2) <= 0 && movex.compareTo(x1) >= 0) {
				System.out.println("Yes");
			} else if (movey.compareTo(y2) <= 0 && movey.compareTo(y1) >= 0) {
				System.out.println("Yes");
			} else
				System.out.println("No");

		}
	}

}
