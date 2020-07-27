import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class activitySelection {

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

	public static int firstNonConflict(int arr[][], int i) {
		for (int k = i + 1; k < arr.length; k++) {
			// First activity whose staring time is greter than
			// or equal to finishing time of current activity;
			if (arr[i][1] <= arr[k][0]) {
				System.out.println(arr[i][1] + " " + arr[k][0]);
				return k;
			}

		}

		return -1;
	}

	public static int scheduling(int arr[][], int i) {

		if (i >= arr.length)
			return 0;

		int j = firstNonConflict(arr, i);
		int include = -1;

		if (j != -1)
			include = arr[i][2] + scheduling(arr, i + 1);

		int exclude = scheduling(arr, i + 1);

		return Math.max(include, exclude);
	}

	public static boolean countTrailingZeroes(int num, int n) {
		int temp = num;
		int i = 5;
		int count = 0;
		while (i <= temp) {
			count += num / i;
			i *= 5;
		}
		return (count >= n);
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		s: while (T-- > 0) {

			int n = nextInt();
			int val = 5;
			int low = 0;
			int high = 5 * n;

			while (low <= high) {
				int mid = (low + high) / 2;

				if (countTrailingZeroes(mid, n))
					high = mid-1;
				else
					low = mid + 1;

				System.out.println(low + " " + (low + high) / 2 + " " + high);
			}
			System.out.println(low);
		}

	}
}
