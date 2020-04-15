package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistributeWeights {

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

			int lines[] = nextArr();
			int n = lines[0];
			int k = lines[1];
			int arr[] = nextArr();
			int val = arr[0];
			int newgroup = 0;
			Boolean flag = true;

			for (int i = 1; i < arr.length; i++) {
				System.out.println(val);
				if (val > n) {
					val = arr[i];
					newgroup++;
				} else
						val += arr[i];


				if (newgroup > k) {
					flag = false;
					break;
				}

			}

			if (flag == true)
				System.out.println(val);

		}
	}

}
