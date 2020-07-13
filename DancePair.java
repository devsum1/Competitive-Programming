package test;
import java.io.*;
import java.util.*;

class DancePair {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int nextInt() throws IOException {
		return Integer.parseInt(br.readLine());
	}

	public static long nextLong() throws IOException {
		return Long.parseLong(br.readLine());
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
		
			Collections.sort(a,Collections.reverseOrder());
		
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

	public static String next() throws IOException {
		return br.readLine();
	}

	static int mat[][];

	public static void newElements(int low, int mid, int high, int n) throws IOException {

		if (low > high)
			return;

		System.out.println(low / n + " " + low % n + " " + high / n + " " + high % n);

		int x = nextInt();

		if (x == -1)
			return;

		// For no covid patient
		if (x == 0)
			return;

		// For all covid patient

		if (x == (high - low) + 1) {
			for (int a = low; a <= high; a++)
				mat[a / n][a % n] = 1;
			return;
		}
		if (low / n == high / n && low % n == high % n) {
			mat[low / n][high / n] = 1;
			return;
		}
		System.out.println(low + " " + mid + " " + high);
		newElements(low, (low + mid) / 2, mid, n);
		newElements(mid + 1, (mid + 1 + high) / 2, high, n);
	}
	public static void elements(int ans, int i, int s, int m, int l) throws IOException {

		if (s > l || l < s)
			return;

		System.out.println(1 + " " + s + " " + s + " " + m + " " + m);
		System.out.println(ans + "ans");

		int x = nextInt();


		if (x == -1)
			return;

		// For no covid patient
		if (x == 0)
			return;

		// For all covid patient
		if (x == (s + l) - 1) {
			for (int a = s; a <= l; a++)
				mat[i - 1][a - 1] = 1;
			return;
		}

		if (s - l == 0) {
			mat[i - 1][s - 1] = x;
			return;
		}

		if (ans - x == 0) {
			// Have to optimise logic...
			for (int a = s; a <= l; a++)
				mat[i - 1][a - 1] = 1;
			return;
		}


		elements(x, i, s, (s + m) / 2, m);
		elements(x, i, m + 1, ((m + 1) + l) / 2, l);

	}
	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			int arr[] = nextArr();
			arr = sortArr(arr);
			for (int i : arr)
				System.out.println(i);

			int n = arr[0];
			mat = new int[n][n];
			int p = arr[1];

			int people[][] = new int[n][n];

			int A = 0, B = 0, X = 0;

			for (int i = 1; i <= n; i++) {
			int s = 0;
			int l = (n * n) - 1;
			int m = (s + l) / 2;
				elements(0, i, s, m, l);
//			newElements(s, m, l, n);
			}
			System.out.println(2);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++)
					System.out.print(mat[i][j] + " ");
				System.out.println();
			}
//			System.out.println(A + " " + B + " " + X);
//			int score = ((2 * n - A) * (2 * n - B)) / (1 + X);
//			System.out.println(score);

			int judge = nextInt();
			if (judge == -1)
				break;

		}
	}

}
