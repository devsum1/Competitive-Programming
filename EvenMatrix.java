import java.io.*;
import java.util.*;

public class EvenMatrix {

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

			int n = nextInt();
			StringBuffer ans = new StringBuffer();
			int curr = 0;

			for (int i = 0; i < n; i++) {
				StringBuffer gen = new StringBuffer();
				if (i % 2 == 0) {
					for (int j = curr + 1; j <= curr + n; j++)
						gen.append(j + " ");
				} else {
					for (int j = curr + n; j > curr; j--)
						gen.append(j + " ");

				}
				curr += n;
				ans.append(gen + "\n");
			}
			System.out.println(ans);
		}
	}

}
