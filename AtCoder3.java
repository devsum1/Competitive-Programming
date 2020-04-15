package test;

//Lucky number from GFG
import java.util.*;
import java.io.*;
import java.math.*;

public class AtCoder3 {

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

			String n = next();
			Boolean isMagic = true;
			ArrayList<BigInteger> res = new ArrayList<BigInteger>();

			s: for (int i = 0; i < n.length(); i++) {
				BigInteger product = new BigInteger(n.charAt(i) + "");
				if (res.contains(product)) {
					isMagic = false;
					break;
				} else
				res.add(product);

				for (int j = i + 1; j < n.length(); j++) {
					product = product.multiply(new BigInteger(n.charAt(j) + ""));
					if (res.contains(product)) {
						isMagic = false;
						break s;
					} else
						res.add(product);

				}
			}

			if (isMagic)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}

}
