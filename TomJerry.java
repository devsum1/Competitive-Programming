import java.io.*;
import java.util.*;

public class TomJerry {

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
			int x = input[1];

			int arr[] = nextArr();

			int ans = Integer.MIN_VALUE;
			int sum = 0;
			boolean nofound = true;

			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];

			}

			if (sum % x != 0)
				System.out.println(arr.length);
			else {
				int i = 0;
				int j = arr.length - 1;
				int sumi = 0;
				int sumj = 0;
				while (i < arr.length || j >= 0) {
					sumi += arr[i++];
					sumj += arr[j--];

					if ((sum - sumi) % x != 0) {
						nofound = false;
						System.out.println(arr.length - i);
						break;
					}
					if ((sum - sumj) % x != 0) {
						nofound = false;
						System.out.println(j + 1);
						break;
					}

				}
				if (nofound)
					System.out.println(-1);

			}



		}
	}

}
