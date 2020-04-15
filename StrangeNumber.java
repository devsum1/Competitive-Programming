package test;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

class StrangeNumber {

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

	public static int primeFactors(int n) {
		int primefactorsnum = 0;
		while (n % 2 == 0) {

			primefactorsnum++;
			n /= 2;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {

				primefactorsnum++;
				n /= i;
			}
		}

		if (n > 2)
			primefactorsnum++;

		return primefactorsnum;
	}


	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while (T-- > 0) {

			int n = s.nextInt();
			int k = s.nextInt();

			int factors1 = primeFactors(n);


			int minDivisor = (int) Math.pow(2, k);

			if (n < minDivisor) {
				System.out.println(0);
				continue;
			} else {

				if (factors1 >= k)
					System.out.println(1);
				else
					System.out.println(0);
			}


		}
	}

}
