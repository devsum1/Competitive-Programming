import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class magicalSticks {

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

	public static int missingAP(int arr[]) {
		int low = 0;
		int high = arr.length - 1;
		int size = arr.length;
		int cd = (arr[high] - arr[low]) / size;
		while (low < high) {
			int mid = (low + high) / 2;
			if (low > high)
				return -1;
			if (arr[mid + 1] - arr[mid] != cd)
				return arr[mid] + cd;
			if (arr[mid] == arr[low] * (mid - low + 1))
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}
	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int input[] = nextArr();
			System.out.println(missingAP(input));

		}
	}

}
