package test;
import java.io.*;
import java.util.*;

class ChefRecipe {
	static BufferedWriter bw = null;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<Integer> primenums = new ArrayList<Integer>();
	static ArrayList<Integer> nonprimenums = new ArrayList<Integer>();
	static ArrayList<ArrayList<Integer>> coprime = new ArrayList<ArrayList<Integer>>();

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

	public static int gcd(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;

		if (a == b)
			return a;

		if (a > b)
			return gcd(a - b, b);

		return gcd(a, b - a);
	}

	public static void checkprime(int n) {

		boolean primes[] = new boolean[n];
		for (int i = 0; i < primes.length; i++) {
			primes[i] = true;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (primes[i - 1]) {
				for (int j = i * 2; j <= n; j += i) {
					if (primes[j - 1]) {
					coprime.get(i - 1).add(j);

					if (j + 1 <= n) {
						coprime.get(i - 1).add(j + 1);
						primes[j] = false;
					}

					primes[j - 1] = false;
					}
				}
			}
		}

		for (int i = 0; i < primes.length; i++) {
			if (primes[i])
				coprime.get(0).add(i + 1);
		}

	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			coprime = new ArrayList<ArrayList<Integer>>();
			for (int i = 0; i < 2; i++) 
				coprime.add(new ArrayList<>());
			
			checkprime(n);

			
			for (int i = 0; i < coprime.size(); i++) {
				System.out.print(coprime.get(i).size());
				for (int j = 0; j < coprime.get(i).size(); j++) {
					System.out.print(coprime.get(i).get(j));
				}
			}


		}
	}
}
