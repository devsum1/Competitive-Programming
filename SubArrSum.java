import java.util.*;
import java.io.*;

public class SubArrSum {

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

			int input[] = nextArr();
			int n = input[0];
			int k = input[1];
			int arr[] = nextArr();
			int i = 0;
			int j = 0;
			int sum = arr[j];
			Boolean flag = false;

			while (i <= j && j < n) {
				if (sum < k) {
					if (j >= n - 1)
						break;
					sum += arr[++j];
				} else if (sum > k) {
					sum -= arr[i++];
				} else {
					flag = true;
					break;
				}

			}
			System.out.println(flag ? (i + 1) + " " + (j + 1) : -1);

		}
	}

}
