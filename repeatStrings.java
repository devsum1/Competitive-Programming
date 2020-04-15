package test;
import java.io.*;
import java.util.*;

class repeatStrings {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int arr[] = new int[1000005];
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
			StringBuilder ans = new StringBuilder("");
			int n = nextInt();


			if (n == 1) {
				System.out.println(1);
				System.out.println(1 + " " + 1);
			} else if (n == 2) {
				System.out.println(1);
				System.out.println(2 + " " + 1 + " " + 2);
			} else {
				ans.append((n / 2) + "\n");
				ans.append("3 1 2 3 \n");

				if (n == 4)
					ans.append("1 " + 4);

				for (int i = 4; i < n; i += 2) {

					if (i == n)
						ans.append(1 + " ");
					else
						ans.append(2 + " ");

					for (int j = 0; j < 2; j++) {
						ans.append(i + j + " ");
					}
					if (n % 2 == 0 && i + 1 == n - 1)
						ans.append("\n1 " + n);
					ans.append("\n");
				}
				System.out.print(ans);
			}
		}

}
}
